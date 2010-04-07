
//获取对象
function _(o) {
    if (typeof (o) == "string")
        return document.getElementById(o);
    return o;
}

//初始化多级选项列表
function CreateTreeSelect(objName, objValue, bMustLast, DefaultValue) {

    if (objValue == "")
        objValue = 0;

    if (DefaultValue == "")
        DefaultValue = 0;

    //var objValueCollection =objName;// 
var objValueCollection =eval("; arr" + objName+";");
    if (objValueCollection == null || objValueCollection.length == 0)
        return;

    var objPathValue = "";

    if (objValue == 0)
        objPathValue = "0";
    else {
        for (var i = 0; i < objValueCollection.length; i++) {
            if (objValueCollection[i][0] == objValue) {
                objPathValue = "0/" + objValueCollection[i][3] + objValue;
                objPathValue = objPathValue.replace("///", "/");
                objPathValue = objPathValue.replace("//", "/");
            }
        }
    }

    //容器
    var obj = _("div" + objName + "Container");
    if (obj == null) { 
        document.write("<span id='" + "div" + objName + "Container" + "'></span>");
        obj = _("div" + objName + "Container");
    } 
    var arrSelect = obj.childNodes;
    var arrValue = objPathValue.split("/"); 
    //清除多余的控件
    for (var i = arrSelect.length - 1; i >= 0; i--) {
        var bMatch = false;

        for (var n = arrValue.length - 1; n >= 0; n--) {
            if (arrSelect[i].id == "select" + objName + "_" + arrValue[n]) {
                bMatch = true;
                break;
            }
        }

        if (!bMatch)
            obj.removeChild(obj.childNodes[i]);
    }

    //根据路径，初始化控件
    var newSelect = null
    var newOption = null;
    var newText = null;

    for (var i = 0; i < arrValue.length; i++) {
        var ParentId = arrValue[i];
        if (ParentId == "")
            continue;

        newSelect = _("select" + objName + "_" + ParentId);
        if (newSelect == null) {
            for (var n = 0; n < objValueCollection.length; n++) {
                if (objValueCollection[n][2] == ParentId && (bMustLast || (objValueCollection[n][0] != DefaultValue && objValueCollection[n][3].indexOf("/" + DefaultValue + "/") == -1)))  //&& (bMustLast || ((ParentId == 0 || ParentId != DefaultValue) && objValueCollection[n][3].indexOf("/"+DefaultValue+"/") == -1 && objValueCollection[n][0] != DefaultValue)))
                {
                    if (newSelect == null) {
                        newSelect = document.createElement('select');
                        newSelect.id = "select" + objName + "_" + ParentId
                        newSelect.name = objName;

                        newOption = document.createElement('option');
                        newOption.value = ParentId;
                        newText = document.createTextNode("请选择");
                        newOption.appendChild(newText);
                        newSelect.appendChild(newOption);
                    }

                    newOption = document.createElement('option');
                    newOption.value = objValueCollection[n][0];
                    newText = document.createTextNode(objValueCollection[n][1]);
                    newOption.appendChild(newText);
                    newSelect.appendChild(newOption);
                }
            }
        }

        if (newSelect != null) {
            if (i < arrValue.length - 1 && arrValue[i + 1] != "") {
                newSelect.value = arrValue[i + 1];
            }
            else if (objValue > 0)
                newSelect.value = objValue;

            newSelect.onchange = function() { CreateTreeSelect(objName, this.value, bMustLast, DefaultValue); }

            obj.appendChild(newSelect);

        }
    }

    if (obj.childNodes.length == 0) {
        newSelect = document.createElement('select');
        newSelect.id = "select" + objName + "_" + ParentId
        newSelect.name = objName;

        newOption = document.createElement('option');
        newOption.value = ParentId;
        newText = document.createTextNode("请选择");
        newOption.appendChild(newText);
        newSelect.appendChild(newOption);

        newSelect.onchange = function() { CreateTreeSelect(objName, this.value, bMustLast, DefaultValue); }

        obj.appendChild(newSelect);
    }

    var objId = _("txt" + objName + "Id");
    if (objId == null) {
        return;
    }
    for (var i = 0; i < obj.childNodes.length; i++) {
        if (obj.childNodes[i].selectedIndex > 0 || i == 0)
            objId.value = obj.childNodes[i].value;
    }

    if (!bMustLast) {
        if (objId.value == "")
            objId.value = "0";
    }
    else {
        if (obj.childNodes[obj.childNodes.length - 1].selectedIndex > 0)
            objId.value = obj.childNodes[obj.childNodes.length - 1].value;
        else
            objId.value = "";
        if (objId.value == "0")
            objId.value = "";
    }
}
//Id-level access in accordance with the name of the Father
function GetParentInfo(id, objName) {
    var reg = /^\-?([1-9]\d*|0)(\.\d+)?_/;
    if (!reg.test(id)) {
        return;
    }
    var objValueCollection = eval("arr" + objName);
    var objPathValue = "";
    var objPath = "";
    var objCurrentPath = "";
    for (var i = 0; i < objValueCollection.length; i++) {
        if (objValueCollection[i][0] == id) {
            objPathValue = objValueCollection[i][3];
            objCurrentPath = objValueCollection[i][1];
            objPathValue = objPathValue.replace("///", "/");
            objPathValue = objPathValue.replace("//", "/");
            break;
        }
    }
    if (objPathValue != "") {
        var startStr = objPathValue.substring(0, 1);
        var endStr = objPathValue.substring(objPathValue.lenght - 1, 1);
        if (startStr == "/")
            objPathValue = objPathValue.substring(1, objPathValue.length);

        if (endStr == "/")
            objPathValue = objPathValue.substring(0, objPathValue.length - 1);

        var spArry = objPathValue.split('/');
        if (spArry.length == 2) {
            for (var j = 0; j < objValueCollection.length; j++) {
                if (objValueCollection[j][0] == spArry[0]) {
                    objPath = objPath + objValueCollection[j][1] + "/";
                }
                if (objValueCollection[j][0] == spArry[1]) {
                    objPath = objPath + objValueCollection[j][1] + "/";
                }
            }
        }
    }
    document.write(objPath + objCurrentPath);
}