//v.1.5 build 9755
/*
CopycurrentIdright DHTMLX LTD. http://www.dhtmlx.com
You allowed to use this component or parts of it under GPL terms
To use it on other terms or get Professional edition of the component please contact us at sales@dhtmlx.com
*/
var files = new Array();
var nouploadfiles = new Array();
var dhtmlXVaultObject = function () {
	var nav = navigator.appName;
	this.IE = nav.indexOf("Explorer") > -1;
	this.Opera = nav.indexOf("Opera") > -1;
	this.isUploadFile = false;
	this.isUploadFileAll = false;
	this.counter = 1;
	this.idRowSelected = null;
	this.sessionId = null;
	this.pathUploadHandler = null;
	this.pathGetInfoHandler = null;
	this.pathGetIdHandler = null;
	this.imPath = "imgs/";
	this.strings = {remove:"移除", upload:"上传", done:"\u5b8c\u6210", error:"ERROR", btnAdd:"添加文件", btnUpload:"上传所有", btnClean:"清除未上传"};
	this.strings.errors = {"TooBig":"File is too big ({0};bytes).\nMax allowed size is {1}.", "PostSize":"Undefined server error. Possible issues:\n- Unicode file name incorrectly processed by the server;\n- File size is bigger than server's post-request limit ({0})."};
	this.filesLimit = 0;
	this.fileList = {};
	this.uploadedCount = 0;
	this.progressDemo = null;
	this.inpMAX_FILE_SIZE = null;
	this.MAX_FILE_SIZE = 900 * 1024 * 1024;
	this.inpUPLOAD_IDENTIFIER = null;
};
dhtmlXVaultObject.prototype.setServerHandlers = function (uploadHandler, getInfoHandler, getIdHandler) {
	this.pathUploadHandler = uploadHandler;
	this.pathGetInfoHandler = getInfoHandler;
	this.pathGetIdHandler = getIdHandler;
};
dhtmlXVaultObject.prototype.setImagePath = function (newPath) {
	this.imPath = newPath;
	this.preLoadImages();
};
dhtmlXVaultObject.prototype.create = function (htmlObject) {
	this.parentObject = document.getElementById(htmlObject);
	this.parentObject.style.position = "relative";
	this.parentObject.innerHTML = "<iframe src='about:blank' id='dhtmlxVaultUploadFrame' name='dhtmlxVaultUploadFrame' style='display:none;position:absolute;left:-1000px;width:1px;height:1px'></iframe>";
	this.containerDiv = document.createElement("div");
	this.containerDiv.className = "dhxvlt_panel2border";
	this.containerDiv.style.cssText = "position:absolute;overflow-y:auto;height:190px;background-color:#FFFFFF;top:10px;left:10px;z-index:10;width:410px";
	this.parentObject.appendChild(this.containerDiv);
	this.container = document.createElement("div");
	this.container.style.position = "relative";
	this.container.innerHTML = "<table class='dhxvlt_panelbg dhxvlt_panelborder' border='0'>" + "<tr><td style='width:416px' colspan='3' align='center' id='cellContainer'>" + "<div style='height:200px'></div>" + "</td></tr>" + "<tr><td style='width:100px;height:32px' align='left'></td>" + "<td style='width:180px;height:32px' align='left'>" + "<div class='dhxvlt_lbtn'><span class='dhxvlt_lbtn1'></span><span class='dhxvlt_lbtn2'><nobr><img src='" + this.imPath + "upload.gif'/> " + this.strings.btnUpload + "</nobr></span><span class='dhxvlt_lbtn3'></span></div></td>" + "<td style='width:136px;height:32px;' align='right'>" + "<div class='dhxvlt_rbtn'><span class='dhxvlt_rbtn3'></span><span class='dhxvlt_rbtn2'><nobr><img src='" + this.imPath + "clean.gif'/> " + this.strings.btnClean + "</nobr></span><span class='dhxvlt_rbtn1'></span></div></td></tr></table>" + "<div class='btnAddBtn dhxvlt_lbtn'><span class='dhxvlt_lbtn1'></span><span class='dhxvlt_lbtn2'><nobr><img src='" + this.imPath + "add.gif'/> " + this.strings.btnAdd + "</nobr></span><span class='dhxvlt_lbtn3'></span></div>" + "<div class='btnAddDiv'>" + "<input type='file' id='file1' name='file1' value='' class='dhxvlt_hidden " + (this.Opera ? "dhxvlt_fo" : "") + "'/></div>";
	this.parentObject.appendChild(this.container);
	var self = this;
	this.container.childNodes[0].rows[1].cells[1].childNodes[0].onclick = function () {
		self.uploadAllItems();
	};
	this.container.childNodes[0].rows[1].cells[2].childNodes[0].onclick = function () {
		self.removeAllItems();
	};
	this.fileContainer = this.container.childNodes[2];
	this.currentFile = this.fileContainer.childNodes[0];
	this.currentFile.onchange = function () {
		self.addFile();
	};
	if (this.IE) {
		this.uploadForm = document.createElement("<form enctype='multipart/form-data' target='dhtmlxVaultUploadFrame' method='post'>");
	} else {
		this.uploadForm = document.createElement("form");
		this.uploadForm.method = "post";
		this.uploadForm.encoding = "multipart/form-data";
		this.uploadForm.target = "dhtmlxVaultUploadFrame";
	}
	this.container.appendChild(this.uploadForm);
	this.inpMAX_FILE_SIZE = document.createElement("input");
	this.inpMAX_FILE_SIZE.type = "hidden";
	this.inpMAX_FILE_SIZE.name = "xMAX_FILE_SIZE";
	this.inpMAX_FILE_SIZE.value = this.MAX_FILE_SIZE;
	this.uploadForm.appendChild(this.inpMAX_FILE_SIZE);
	this.inpUPLOAD_IDENTIFIER = document.createElement("input");
	this.inpUPLOAD_IDENTIFIER.type = "hidden";
	this.inpUPLOAD_IDENTIFIER.name = "UPLOAD_IDENTIFIER";
	this.uploadForm.appendChild(this.inpUPLOAD_IDENTIFIER);
	this.tblListFiles = null;
	this.tblProgressBar = this.createProgressBar();
	this.percentPanel = this.createPercentPanel();
	this.containerDiv.appendChild(this.percentPanel);
	this.progressDemo = this.createProgressDemo();
};
dhtmlXVaultObject.prototype.createXMLHttpRequest = function () {
	var xmlHttp = null;
	if (window.ActiveXObject) {
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	} else {
		if (window.XMLHttpRequest) {
			xmlHttp = new XMLHttpRequest();
		}
	}
	return xmlHttp;
};
dhtmlXVaultObject.prototype.getFileName = function (path) {
	var arr = path.split("\\");
	path = arr[arr.length - 1];
	arr = path.split("/");
	return arr[arr.length - 1];
};
dhtmlXVaultObject.prototype.selectItem = function (currentId) {
	var currentRow = this.getCurrentRowListFiles(currentId);
	if (this.idRowSelected) {
		var row = this.getCurrentRowListFiles(this.idRowSelected);
		if (row) {
			if (row.id != currentRow.id) {
				currentRow.className = "dhxvlt_rowsel";
				this.idRowSelected = currentId;
				row.className = "dhxvlt_row";
			} else {
				currentRow.className = "dhxvlt_row";
				this.idRowSelected = "";
			}
		} else {
			currentRow.className = "dhxvlt_rowsel";
			this.idRowSelected = currentId;
		}
	} else {
		currentRow.className = "dhxvlt_rowsel";
		this.idRowSelected = currentId;
	}
};
dhtmlXVaultObject.prototype.enableAddButton = function (enabled) {
	this.currentFile.disabled = !enabled;
	var btn = this.currentFile.parentNode.previousSibling.childNodes[1].childNodes[0].childNodes[0];
	btn.src = this.imPath + (enabled ? "add.gif" : "add_d.gif");
	btn.parentNode.className = enabled ? "" : "dhxvlt_dis";
};
dhtmlXVaultObject.prototype.checkFilesLimit = function () {
	if (this.filesLimit > 0) {
		var n = this.getTotalFilesCount();
		this.enableAddButton(n < this.filesLimit);
	}
};
dhtmlXVaultObject.prototype.addFile = function () {
	var file = this.currentFile;
	
	//alert(this.getFileName(file.value)+"文件名");
	for (var i in files) {
	//console.log(files[i]);
		if (files[i]==this.getFileName(file.value)) {
		alert("文件:"+this.getFileName(file.value)+"\t已存在");
		return;
		}
	}
		for (var i in nouploadfiles) {
	    //console.log(nouploadfiles[i]);
		if (nouploadfiles[i]==this.getFileName(file.value)) {
		alert("文件:"+this.getFileName(file.value)+"\t已存在");
		return;
		}
	}
	
	nouploadfiles.push(this.getFileName(file.value));
	
	try {
		if (file.value == "") {
			return;
		}
		if (!this.onAddFile(file.value)) {
			file.value = "";
			return;
		}
	}
	catch (e) {
	}
	var currentId = this.createId();
	this.fileList[currentId] = {id:currentId, name:file.value, uploaded:false, error:false};
	file.disabled = true;
	file.style.display = "none";
	this.uploadForm.appendChild(file);
	var newInputFile = document.createElement("input");
	newInputFile.type = "file";
	newInputFile.className = "dhxvlt_hidden" + (this.Opera ? " dhxvlt_fo" : "");
	newInputFile.id = "file" + (currentId + 1);
	newInputFile.name = newInputFile.id;
	this.currentFile = newInputFile;
	var self = this;
	newInputFile.onchange = function () {
		return self.addFile();
	};
	this.fileContainer.appendChild(newInputFile);
	var fileName = this.getFileName(file.value);
	var imgFile = this.getImgFile(fileName);
	var containerData = this.containerDiv;
	if (this.tblListFiles == null) {
		this.tblListFiles = this.createTblListFiles();
		containerData.appendChild(this.tblListFiles);
	}
	var rowListFiles = this.tblListFiles.insertRow(this.tblListFiles.rows.length);
	rowListFiles.setAttribute("fileItemId", currentId);
	rowListFiles.setAttribute("id", "rowListFiles" + currentId);
	rowListFiles.setAttribute("isUpload", "false");
	rowListFiles.onclick = function () {
		self.selectItem(currentId);
	};
	var cellListFiles = document.createElement("td");
	cellListFiles.align = "center";
	rowListFiles.appendChild(cellListFiles);
	var tblContent = document.createElement("table");
	cellListFiles.appendChild(tblContent);
	tblContent.style.cssText = "border-bottom:1px solid #E2E2E2";
	tblContent.cellPadding = "0px";
	tblContent.cellSpacing = "0px";
	tblContent.border = "0px";
	tblContent.id = "tblContent" + currentId;
	var rowList = tblContent.insertRow(tblContent.rows.length);
	var cellList = document.createElement("td");
	cellList.rowSpan = 2;
	cellList.align = "center";
	if (this.IE) {
		var span = document.createElement("span");
		span.style.cssText = "width:40px;height:40px;display:inline-block;filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='" + imgFile + " ')";
		cellList.appendChild(span);
	} else {
		cellList.innerHTML = "<img src='" + imgFile + "'/>";
	}
	cellList.style.width = "60px";
	rowList.appendChild(cellList);
	cellList = document.createElement("td");
	cellList.align = "left";
	cellList.vAlign = "bottom";
	cellList.style.cssText = "width:300px;height:30px";
	cellList.innerHTML = "<div class='fileName'><div class='fileName'>" + fileName + "</div></div> ";
	cellList.className = "fileName";
	
	
	//files[counter]=filename;
	rowList.appendChild(cellList);
	cellList = document.createElement("td");
	cellList.style.cssText = "width:140px;height:30px";
	cellList.innerHTML = "<div title='" + this.strings.remove + "' id='dhxvlt_icoremove'></div><a href='javascript:void(0)' class='link dhxvlt_txtremove'>" + this.strings.remove + "</a>";
	cellList.firstChild.onclick = cellList.childNodes[1].onclick = function () {
		self.removeItem(currentId);
	};
	cellList.vAlign = "bottom";
	cellList.align = "center";
	rowList.appendChild(cellList);
	rowList = tblContent.insertRow(tblContent.rows.length);
	cellList = document.createElement("td");
	cellList.align = "left";
	cellList.style.cssText = "width:300px;height:30px";
	rowList.appendChild(cellList);
	cellList = document.createElement("td");
	cellList.style.cssText = "width:140px;height:30px";
	//cellList.innerHTML = "<a href='javascript:void(0)' class='link' style='visibility:hidden'>" + this.strings.upload + "</a>";
	cellList.innerHTML = "<a href='javascript:void(0)' class='link' >" + this.strings.upload + "</a>";
	cellList.firstChild.onclick = function () {
		self.uploadFile(currentId);
		return false;
	};
	cellList.vAlign = "middle";
	cellList.align = "center";
	rowList.appendChild(cellList);
	this.checkFilesLimit();
};
dhtmlXVaultObject.prototype.getFileExtension = function (fileName) {
	var ext = "", arr = fileName.split(".");
	if (arr.length > 1) {
		ext = arr[arr.length - 1].toLowerCase();
	}
	return ext;
};
dhtmlXVaultObject.prototype.getImgFile = function (fileName) {
	var srcImgPic = this.imPath + "ico_image.png";
	var srcImgVideo = this.imPath + "ico_video.png";
	var srcImgSound = this.imPath + "ico_sound.png";
	var srcImgArchives = this.imPath + "ico_zip.png";
	var srcImgFile = this.imPath + "ico_file.png";
	var valueImgPic = "jpg,jpeg,gif,png,bmp,tiff";
	var valueImgVideo = "avi,mpg,mpeg,rm,move";
	var valueImgSound = "wav,mp3,ogg";
	var valueImgArchives = "zip,rar,tar,tgz,arj";
	var ext = this.getFileExtension(fileName);
	if (ext == "") {
		return srcImgFile;
	}
	if (valueImgPic.indexOf(ext) != -1) {
		return srcImgPic;
	}
	if (valueImgVideo.indexOf(ext) != -1) {
		return srcImgVideo;
	}
	if (valueImgSound.indexOf(ext) != -1) {
		return srcImgSound;
	}
	if (valueImgArchives.indexOf(ext) != -1) {
		return srcImgArchives;
	}
	return srcImgFile;
};
dhtmlXVaultObject.prototype.createId = function () {
	return this.counter++;
};
dhtmlXVaultObject.prototype.createTblListFiles = function () {
	var tblListFiles = document.createElement("table");
	tblListFiles.id = "tblListFiles";
	tblListFiles.style.backgroundColor = "#FFFFFF";
	tblListFiles.cellPadding = "0";
	tblListFiles.cellSpacing = "0";
	tblListFiles.border = "0";
	return tblListFiles;
};
//移除一条
dhtmlXVaultObject.prototype.removeItem = function (id) {
	var r = this.getCurrentRowListFiles(id);
	r.parentNode.removeChild(r);
	delete this.fileList[id];
	delete nouploadfiles[id-1];
	//nouploadfiles.splice(id-1,1);
	this.checkFilesLimit();
};
//删除没有上传的
/*
注意tblListFiles删除一行后总的长度减一
*/
dhtmlXVaultObject.prototype.removeAllItems = function () {
	if (!this.isUploadFile) {
		if (this.tblListFiles != null) {
			var count = this.tblListFiles.rows.length;
			if (count > 0) {
				var j = 0;
				for (var i = 0; i < count; i++) {
				
				
				//this.tblListFiles.deleteRow(0);删除所有的
					if (this.tblListFiles.rows[j].attributes["isUpload"].value == "false") {
						this.tblListFiles.deleteRow(j);
					} else {
						j++;
					}
				}
			}
		}
		this.fileList = {};
	}
	nouploadfiles = new Array();
	this.checkFilesLimit();
};
dhtmlXVaultObject.prototype.uploadAllItems = function () {
	var flag = -1;
	if (this.tblListFiles != null) {
		if (this.tblListFiles.rows.length > 0) {
			for (var i = 0; i < this.tblListFiles.rows.length; i++) {
				if (this.tblListFiles.rows[i].attributes["isUpload"].value == "false") {
					flag = i;
					break;
				}
			}
			if (flag != -1) {
				this.isUploadFileAll = true;
				var fileItemId = this.tblListFiles.rows[i].attributes["fileItemId"].value;
				this.uploadFile(fileItemId);
			} else {
				if (this.isUploadFileAll) {
					try {
						this.onUploadComplete(this.objToArray(this.fileList));
					}
					catch (e) {
					}
				}
				this.fileList = {};
				this.isUploadFileAll = false;
			}
		}
	}
};
dhtmlXVaultObject.prototype.objToArray = function (obj) {
	var res = new Array();
	for (var key in obj) {
		res[res.length] = obj[key];
	}
	return res;
};
dhtmlXVaultObject.prototype.createProgressDemo = function () {
	var srcImgProgress = this.imPath + "pb_demoupload.gif";
	var tblProgress = document.createElement("table");
	tblProgress.cellPadding = "0";
	tblProgress.cellSpacing = "0";
	tblProgress.border = "0";
	tblProgress.style.cssText = "height:10px;width:153px;display:none;";
	tblProgress.id = "progress";
	var row = tblProgress.insertRow(tblProgress.rows.length);
	var cell1 = document.createElement("td");
	cell1.style.cssText = "font-size:1px;border:1px solid #A9AEB3;";
	cell1.innerHTML = "<img src=" + srcImgProgress + " style = 'width:150px;height:8px;'/>";
	row.appendChild(cell1);
	return tblProgress;
};
dhtmlXVaultObject.prototype.createProgressBar = function () {
	var srcImgProgress = this.imPath + "pb_back.gif";
	var srcImgEmpty = this.imPath + "pb_empty.gif";
	var tblProgress = document.createElement("table");
	tblProgress.cellPadding = "0";
	tblProgress.cellSpacing = "0";
	tblProgress.border = "0";
	tblProgress.style.cssText = "height:10px;width:149px;border-bottom:0px !important;display:none";
	tblProgress.id = "progress";
	var row = tblProgress.insertRow(tblProgress.rows.length);
	var cell1 = document.createElement("td");
	cell1.style.cssText = "font-size:1px;background-image:url(" + srcImgProgress + ");width:150px;height:10px;border:1px solid #A9AEB3";
	cell1.align = "right";
	var img = document.createElement("img");
	img.src = srcImgEmpty;
	img.style.width = "100%";
	img.style.height = "7px";
	cell1.appendChild(img);
	row.appendChild(cell1);
	return tblProgress;
};
dhtmlXVaultObject.prototype.createPercentPanel = function () {
	var percentCompleted = document.createElement("div");
	percentCompleted.style.cssText = "font-size:9px;height:8px;position:absolute;left:210px;width:20px;display:none;padding-top:0px";
	percentCompleted.id = "percentCompletedValue";
	return percentCompleted;
};
dhtmlXVaultObject.prototype.endLoading = function (id, isError) {
	this.isUploadFile = false;
	this.progressDemo.style.display = "none";
	this.container.appendChild(this.progressDemo);
	var f = this.fileList[id];
	if (f) {
		f.error = isError;
		f.uploaded = !isError;
	}
	try {
		this.onFileUploaded(f);
	}
	catch (e) {
	}
	if (isError) {
		try {
			this.onUploadComplete(this.objToArray(this.fileList));
		}
		catch (e) {
		}
	}
	var c = this.getCurrentInputFile(id);
	if (c) {
		c.parentNode.removeChild(c);
	}
};
dhtmlXVaultObject.prototype.startRequest = function (id) {
	var xmlHttp = this.createXMLHttpRequest();
	xmlHttp.open("POST", this.pathGetIdHandler, false);
	xmlHttp.send("id=" + id);
	if (xmlHttp.status == 200) {
		if (!xmlHttp.responseText) {
			throw "error";
		}
		this.sessionId = xmlHttp.responseText;
		this.inpUPLOAD_IDENTIFIER.value = this.sessionId;
	} else {
		throw "error";
	}
};
dhtmlXVaultObject.prototype.sendIdSession = function (id) {
	try {
		var xmlHttp = this.createXMLHttpRequest();
		xmlHttp.open("post", this.pathGetInfoHandler, false);
		xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
		xmlHttp.send("sessionId=" + this.sessionId);
		if (xmlHttp.status == 200) {
			var res = xmlHttp.responseText;
			if (res) {
				var err = res.split(":");
				if (err[0] == "error") {
					if (err[1] == -2) {
						var f = document.getElementById("dhtmlxVaultUploadFrame");
						if (f) {
							f.src = "about:blank";
						}
						alert(this.printf(this.strings.errors["TooBig"], err[2], err[3]));
					} else {
						if (err[1] == -3) {
							alert(this.printf(this.strings.errors["PostSize"], err[2]));
						}
					}
					throw "error";
				}
				res = parseInt(res, 10);
				if (isNaN(res)) {
					throw "error";
				}
				if (res != -1) {
					var self = this;
					try {
						window.setTimeout(function () {
							self.sendIdSession(id);
						}, 500);
					}
					catch (e) {
					}
				} else {
					if (res == -1) {
						this.uploadedCount++;
						this.endLoading(id, false);
						this.showMessageInfo(id, this.strings.done);
						if (this.isUploadFileAll) {
							this.uploadAllItems();
						}
					}
				}
			}
		} else {
			throw "error";
		}
	}
	catch (e) {
		this.endLoading(id, true);
		this.isUploadFileAll = false;
		this.isUploadFile = false;
		this.showMessageInfo(id, this.strings.error);
	}
};
dhtmlXVaultObject.prototype.printf = function () {
	var n = arguments.length;
	var str = arguments[0];
	for (var i = 1; i < n; i++) {
		var pattern = "\\{" + (i - 1) + "\\}";
		var re = new RegExp(pattern, "g");
		str = str.replace(re, arguments[i]);
	}
	return str;
};
dhtmlXVaultObject.prototype.showMessageInfo = function (id, msg) {
	var tblContent = this.getCurrentTblContent(id);
	tblContent.rows[1].cells[0].innerHTML += "<font class='text'>" + msg + "</font>";
	tblContent.rows[1].cells[0].vAlign = "top";
};
dhtmlXVaultObject.prototype.showProgressInfo = function (perc) {
	this.tblProgressBar.rows[0].cells[0].firstChild.style.width = 100 - perc + "%";
	this.percentPanel.innerHTML = "<nobr>" + perc + "%</nobr>";
};
dhtmlXVaultObject.prototype.getFilesCount = function () {
	return this.tblListFiles && this.tblListFiles.rows ? this.tblListFiles.rows.length : 0;
};
dhtmlXVaultObject.prototype.getTotalFilesCount = function () {
	var count = this.uploadedCount;
	if (this.tblListFiles != null) {
		if (this.tblListFiles.rows.length > 0) {
			for (var i = 0; i < this.tblListFiles.rows.length; i++) {
				if (this.tblListFiles.rows[i].attributes["isUpload"].value == "false") {
					count++;
				}
			}
		}
	}
	return count;
};
dhtmlXVaultObject.prototype.getCurrentRowListFiles = function (id) {
	for (var i = 0; i < this.tblListFiles.rows.length; i++) {
		if (this.tblListFiles.rows[i].id == "rowListFiles" + id) {
			return this.tblListFiles.rows[i];
		}
	}
};
dhtmlXVaultObject.prototype.getCurrentTblContent = function (id) {
	for (var i = 0; i < this.tblListFiles.rows.length; i++) {
		if (this.tblListFiles.rows[i].cells[0].firstChild.id == "tblContent" + id) {
			return this.tblListFiles.rows[i].cells[0].firstChild;
		}
	}
};
dhtmlXVaultObject.prototype.getFormField = function (type, name) {
	var fields = this.uploadForm.getElementsByTagName("input");
	for (var i = 0; i < fields.length; i++) {
		var f = fields[i];
		if (f.type.toLowerCase() == type && f.name == name) {
			return f;
		}
	}
	return null;
};
dhtmlXVaultObject.prototype.getCurrentInputFile = function (id) {
	return this.getFormField("file", "file" + id);
};

//单个上传
dhtmlXVaultObject.prototype.uploadFile = function (id) {
	if (!this.isUploadFile) {
		this.selectItem(id);
		var tblContent = this.getCurrentTblContent(id);
		tblContent.rows[0].cells[2].removeChild(tblContent.rows[0].cells[2].firstChild);
		tblContent.rows[1].cells[1].removeChild(tblContent.rows[1].cells[1].firstChild);
		tblContent.parentNode.parentNode.attributes["isUpload"].value = "true";
		this.isUploadFile = true;
		this.getCurrentInputFile(id).disabled = false;
		this.progressDemo.style.display = "inline";
		this.getCurrentRowListFiles(id).cells[0].firstChild.rows[1].cells[0].appendChild(this.progressDemo);
		try {
			this.startRequest(id);
			this.sendIdSession(id);
		}
		catch (e) {
			this.endLoading(id, true);
			this.isUploadFileAll = false;
			this.isUploadFile = false;
			tblContent.rows[1].cells[0].innerHTML += "<font class='text'>" + this.strings.error + "</font>";
			tblContent.rows[1].cells[0].vAlign = "top";
			return;
		}
		if (!this.isUploadFile) {
			return;
		}
		this.uploadForm.action = this.pathUploadHandler + "?sessionId=" + this.sessionId + "&fileName=" + escape(this.getFileName(this.getCurrentInputFile(id).value)) + "&userfile=" + this.getCurrentInputFile(id).id;
		this.uploadForm.submit();
		files.push(this.getFileName(this.getCurrentInputFile(id).value));
	}
};
dhtmlXVaultObject.prototype.preLoadImages = function () {
	var imSrcAr = new Array("add.gif", "add_d.gif", "btn1.gif", "btn2.gif", "btn3.gif", "clean.gif", "upload.gif", "delete.gif", "ico_file.png", "ico_image.png", "ico_sound.png", "ico_video.png", "ico_zip.png", "pb_back.gif", "pb_demoupload.gif", "pb_empty.gif", "rowsel.gif");
	var imAr = new Array(imSrcAr.length);
	for (var i = 0; i < imSrcAr.length; i++) {
		imAr[i] = new Image();
		imAr[i].src = this.imPath + imSrcAr[i];
	}
};
dhtmlXVaultObject.prototype.setFilesLimit = function (limit) {
	var n = parseInt(limit);
	if (!isNaN(n) && n >= 0) {
		this.filesLimit = n;
	}
};
dhtmlXVaultObject.prototype.setFormField = function (name, value) {
	if (!this.uploadForm) {
		alert("Please call setFormField() method after create()!");
		return;
	}
	var field = this.getFormField("hidden", name);
	if (value === null) {
		if (field) {
			this.uploadForm.removeChild(field);
		}
	} else {
		if (!field) {
			field = document.createElement("input");
			field.type = "hidden";
			field.name = name;
			this.uploadForm.appendChild(field);
		}
		field.value = value;
	}
};
dhtmlXVaultObject.prototype.onAddFile = function (fileName) {
	return true;
};
dhtmlXVaultObject.prototype.onUploadComplete = function (files) {
};
dhtmlXVaultObject.prototype.onFileUploaded = function (file) {
};
//v.1.5 build 9755
/*
Copyright DHTMLX LTD. http://www.dhtmlx.com
You allowed to use this component or parts of it under GPL terms
To use it on other terms or get Professional edition of the component please contact us at sales@dhtmlx.com
*/

