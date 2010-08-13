var songajax = {
picsDir : './songajax/', 
expandCursor : 'zoomin.cur',
restoreCursor : 'zoomout.cur',
expandDuration : 250,
restoreDuration : 250,
marginLeft : 15,
marginRight : 15,
marginTop : 15,
marginBottom : 15,
zIndexCounter : 1001,
loadingOpacity : 0.75,
allowMultipleInstances: true,
numberOfImagesToPreload : 5,
outlineWhileAnimating : 2,
outlineStartOffset : 3,
padToMinWidth : false,
fullExpandPosition : 'bottom right',
fullExpandOpacity : 1,
showCredits : false,
creditsHref : 'http://www.songcms.com',
creditsTarget : '_self',
enableKeyListener : true,
openerTagNames : ['a'],
allowWidthReduction : false,
allowHeightReduction : true,
preserveContent : true, 
objectLoadTime : 'after',
cacheAjax : true,
dragByHeading: true,
minWidth: 200,
minHeight: 200,
allowSizeReduction: true,
outlineType : 'drop-shadow',
skin : {
	contentWrapper:
		'<div class="songajax-header"><ul>'+
			'<li Id="songajaxTitleLogo"><a href="#" onclick="return songajax.close(this)"></a></li><li Id="songajaxTitle">'+unescape("SongCMS%20%u7F51%u7AD9%u540E%u53F0%u7BA1%u7406%u7CFB%u7EDF")+'</li>'+
			'<li class="songajax-previous">'+
				'<a href="#" title="{songajax.lang.previousTitle}" onclick="return songajax.previous(this)">'+
				'<span>{songajax.lang.previousText}</span></a>'+
			'</li>'+
			'<li class="songajax-next">'+
				'<a href="#" title="{songajax.lang.nextTitle}" onclick="return songajax.next(this)">'+
				'<span>{songajax.lang.nextText}</span></a>'+
			'</li>'+
			'<li class="songajax-move">'+
				'<a href="#" title="{songajax.lang.moveTitle}" onclick="return false">'+
				'<span>{songajax.lang.moveText}</span></a>'+
			'</li>'+
			'<li class="songajax-close">'+
				'<a href="#" title="{songajax.lang.closeTitle}" onclick="return songajax.close(this)">'+
				'<span>{songajax.lang.closeText}</span></a>'+
			'</li>'+
		'</ul></div>'+
		'<div class="songajax-body"></div>'+
		'<div class="songajax-footer"><div>'+
			'<span class="songajax-resize" title="{songajax.lang.resizeTitle}"><span></span></span>'+
		'</div></div>'
},
preloadTheseImages : [],
continuePreloading: true,
expanders : [],
overrides : [
	'allowSizeReduction',
	'useBox',
	'outlineType',
	'outlineWhileAnimating',
	'captionId',
	'captionText',
	'captionEval',
	'captionOverlay',
	'headingId',
	'headingText',
	'headingEval',
	'headingOverlay',
	'creditsPosition',
	'dragByHeading',
	'width',
	'height',
	'contentId',
	'allowWidthReduction',
	'allowHeightReduction',
	'preserveContent',
	'maincontentId',
	'maincontentText',
	'maincontentEval',
	'objectType',	
	'cacheAjax',	
	'objectWidth',
	'objectHeight',
	'objectLoadTime',	
	'swfOptions',
	'wrapperClassName',
	'minWidth',
	'minHeight',
	'maxWidth',
	'maxHeight',
	'slideshowGroup',
	'easing',
	'easingClose',
	'fadeInOut',
	'src'
],
lang : {
	cssDirection: 'ltr',
	loadingText : 'Loading...',
	loadingTitle : 'Click to cancel',
	focusTitle : 'Click to bring to front',
	fullExpandTitle : 'Expand to actual size (f)',
	creditsText : 'Powered by SongCMS',
	creditsTitle : 'Go to the songajax JS homepage',
	previousText : 'Previous',
	nextText : 'Next', 
	moveText : 'Move',
	closeText : 'Close', 
	closeTitle : 'Close (esc)', 
	resizeTitle : 'Resize',
	playText : 'Play',
	playTitle : 'Play slideshow (spacebar)',
	pauseText : 'Pause',
	pauseTitle : 'Pause slideshow (spacebar)',
	previousTitle : 'Previous (arrow left)',
	nextTitle : 'Next (arrow right)',
	moveTitle : 'Move',
	fullExpandText : '1:1',
	restoreTitle : 'Click to close image, click and drag to move. Use arrow keys for next and previous.'
},
overlays : [],
idCounter : 0,
oPos : {
	x: ['leftpanel', 'left', 'center', 'right', 'rightpanel'],
	y: ['above', 'top', 'middle', 'bottom', 'below']
},
mouse: {},
headingOverlay: {},
captionOverlay: {},
swfOptions: { flashvars: {}, params: {}, attributes: {} },
timers : [],
pendingOutlines : {},
sleeping : [],
preloadTheseAjax : [],
cacheBindings : [],
cachedGets : {},
clones : {},
onReady: [],
uaVersion: parseFloat((navigator.userAgent.toLowerCase().match( /.+(?:rv|it|ra|ie)[\/: ]([\d.]+)/ ) || [0,'0'])[1]),
ie : (document.all && !window.opera),
safari : /Safari/.test(navigator.userAgent),
geckoMac : /Macintosh.+rv:1\.[0-8].+Gecko/.test(navigator.userAgent),
$ : function (id) {
	if (id) return document.getElementById(id);
},
push : function (arr, val) {
	arr[arr.length] = val;
},
createElement : function (tag, attribs, styles, parent, nopad) {
	var el = document.createElement(tag);
	if (attribs) songajax.extend(el, attribs);
	if (nopad) songajax.setStyles(el, {padding: 0, border: 'none', margin: 0});
	if (styles) songajax.setStyles(el, styles);
	if (parent) parent.appendChild(el);	
	return el;
},
extend : function (el, attribs) {
	for (var x in attribs) el[x] = attribs[x];
	return el;
},
setStyles : function (el, styles) {
	for (var x in styles) {
		if (songajax.ie && x == 'opacity') {
			if (styles[x] > 0.99) el.style.removeAttribute('filter');
			else el.style.filter = 'alpha(opacity='+ (styles[x] * 100) +')';
		}
		else el.style[x] = styles[x];
	}
},
animate: function(el, prop, opt) {
	var start,
		end,
		unit;
	if (typeof opt != 'object' || opt === null) {
		var args = arguments;
		opt = {
			duration: args[2],
			easing: args[3],
			complete: args[4]
		};
	}
	if (typeof opt.duration != 'number') opt.duration = 250;
	opt.easing = Math[opt.easing] || Math.easeInQuad;
	opt.curAnim = songajax.extend({}, prop);
	for (var name in prop) {
		var e = new songajax.fx(el, opt , name );
		start = parseFloat(songajax.css(el, name)) || 0;
		end = parseFloat(prop[name]);
		unit = name != 'opacity' ? 'px' : '';
		e.custom( start, end, unit );
	}	
},
css: function(el, prop) {
	if (document.defaultView) {
		return document.defaultView.getComputedStyle(el, null).getPropertyValue(prop);
	} else {
		if (prop == 'opacity') prop = 'filter';
		var val = el.currentStyle[prop.replace(/\-(\w)/g, function (a, b){ return b.toUpperCase(); })];
		if (prop == 'filter') 
			val = val.replace(/alpha\(opacity=([0-9]+)\)/, 
				function (a, b) { return b / 100 });
		return val === '' ? 1 : val;
	} 
},
getPageSize : function () {
	var d = document, w = window, iebody = d.compatMode && d.compatMode != 'BackCompat' 
		? d.documentElement : d.body;
	var width = songajax.ie ? iebody.clientWidth : 
			(d.documentElement.clientWidth || self.innerWidth),
		height = songajax.ie ? iebody.clientHeight : self.innerHeight;
	songajax.page = {
		width: width,
		height: height,		
		scrollLeft: songajax.ie ? iebody.scrollLeft : pageXOffset,
		scrollTop: songajax.ie ? iebody.scrollTop : pageYOffset
	}
},
getPosition : function(el)	{
	var p = { x: el.offsetLeft, y: el.offsetTop };
	while (el.offsetParent)	{
		el = el.offsetParent;
		p.x += el.offsetLeft;
		p.y += el.offsetTop;
		if (el != document.body && el != document.documentElement) {
			p.x -= el.scrollLeft;
			p.y -= el.scrollTop;
		}
	}
	return p;
},
expand : function(a, params, custom, type) {
	if (!a) a = songajax.createElement('a', null, { display: 'none' }, songajax.container);
	if (typeof a.getParams == 'function') return params;
	if (type == 'html') {
		for (var i = 0; i < songajax.sleeping.length; i++) {
			if (songajax.sleeping[i] && songajax.sleeping[i].a == a) {
				songajax.sleeping[i].awake();
				songajax.sleeping[i] = null;
				return false;
			}
		}
		songajax.hasHtmlExpanders = true;
	}	
	try {	
		new songajax.Expander(a, params, custom, type);
		return false;
	} catch (e) { return true; }
},
htmlExpand : function(a, params, custom) {
	return songajax.expand(a, params, custom, 'html');
},
getSelfRendered : function() {
	return songajax.createElement('div', { 
		className: 'songajax-html-content', 
		innerHTML: songajax.replaceLang(songajax.skin.contentWrapper) 
	});
},
getElementByClass : function (el, tagName, className) {
	var els = el.getElementsByTagName(tagName);
	for (var i = 0; i < els.length; i++) {
    	if ((new RegExp(className)).test(els[i].className)) {
			return els[i];
		}
	}
	return null;
},
replaceLang : function(s) {
	s = s.replace(/\s/g, ' ');
	var re = /{songajax\.lang\.([^}]+)\}/g,
		matches = s.match(re),
		lang;
	if (matches) for (var i = 0; i < matches.length; i++) {
		lang = matches[i].replace(re, "$1");
		if (typeof songajax.lang[lang] != 'undefined') s = s.replace(matches[i], songajax.lang[lang]);
	}
	return s;
},
getCacheBinding : function (a) {
	for (var i = 0; i < songajax.cacheBindings.length; i++) {
		if (songajax.cacheBindings[i][0] == a) {
			var c = songajax.cacheBindings[i][1];
			songajax.cacheBindings[i][1] = c.cloneNode(1);
			return c;
		}
	}
	return null;
},
preloadAjax : function (e) {
	var arr = songajax.getAnchors();
	for (var i = 0; i < arr.htmls.length; i++) {
		var a = arr.htmls[i];
		if (songajax.getParam(a, 'objectType') == 'ajax' && songajax.getParam(a, 'cacheAjax'))
			songajax.push(songajax.preloadTheseAjax, a);
	}
	songajax.preloadAjaxElement(0);
},
preloadAjaxElement : function (i) {
	if (!songajax.preloadTheseAjax[i]) return;
	var a = songajax.preloadTheseAjax[i];
	var cache = songajax.getNode(songajax.getParam(a, 'contentId'));
	if (!cache) cache = songajax.getSelfRendered();
	var ajax = new songajax.Ajax(a, cache, 1);	
   	ajax.onError = function () { };
   	ajax.onLoad = function () {
   		songajax.push(songajax.cacheBindings, [a, cache]);
   		songajax.preloadAjaxElement(i + 1);
   	};
   	ajax.run();
},
focusTopmost : function() {
	var topZ = 0, 
		topmostKey = -1,
		expanders = songajax.expanders,
		exp,
		zIndex;
	for (var i = 0; i < expanders.length; i++) {
		exp = expanders[i];
		if (exp) {
			zIndex = exp.wrapper.style.zIndex;
			if (zIndex && zIndex > topZ) {
				topZ = zIndex;				
				topmostKey = i;
			}
		}
	}
	if (topmostKey == -1) songajax.focusKey = -1;
	else expanders[topmostKey].focus();
},
getParam : function (a, param) {
	a.getParams = a.onclick;
	var p = a.getParams ? a.getParams() : null;
	a.getParams = null;
	return (p && typeof p[param] != 'undefined') ? p[param] : 
		(typeof songajax[param] != 'undefined' ? songajax[param] : null);
},
getSrc : function (a) {
	var src = songajax.getParam(a, 'src');
	if (src) return src;
	return a.href;
},
getNode : function (id) {
	var node = songajax.$(id), clone = songajax.clones[id], a = {};
	if (!node && !clone) return null;
	if (!clone) {
		clone = node.cloneNode(true);
		clone.id = '';
		songajax.clones[id] = clone;
		return node;
	} else {
		return clone.cloneNode(true);
	}
},
discardElement : function(d) {
	if (d) songajax.garbageBin.appendChild(d);
	songajax.garbageBin.innerHTML = '';
},
transit : function (adj, exp) {
	var last = exp = exp || songajax.getExpander();
	if (songajax.upcoming) return false;
	else songajax.last = last;
	try {
		songajax.upcoming = adj;
		adj.onclick(); 		
	} catch (e){
		songajax.last = songajax.upcoming = null;
	}
	try {
		exp.close();
	} catch (e) {}
	return false;
},
previousOrNext : function (el, op) {
	var exp = songajax.getExpander(el);
	if (exp) {
		adj = exp.getAdjacentAnchor(op);
		return songajax.transit(adj, exp);
	} else return false;
},
previous : function (el) {
	return songajax.previousOrNext(el, -1);
},
next : function (el) {
	return songajax.previousOrNext(el, 1);	
},
keyHandler : function(e) {
	if (!e) e = window.event;
	if (!e.target) e.target = e.srcElement; // ie
	if (typeof e.target.form != 'undefined') return true; // form element has focus
	var exp = songajax.getExpander();
	var op = null;
	switch (e.keyCode) {
		case 70: // f
			if (exp) exp.doFullExpand();
			return true;
		case 32: // Space
		case 34: // Page Down
		case 39: // Arrow right
		case 40: // Arrow down
			op = 1;
			break;
		case 8:  // Backspace
		case 33: // Page Up
		case 37: // Arrow left
		case 38: // Arrow up
			op = -1;
			break;
		case 27: // Escape
		case 13: // Enter
			op = 0;
	}
	if (op !== null) {songajax.removeEventListener(document, window.opera ? 'keypress' : 'keydown', songajax.keyHandler);
		if (!songajax.enableKeyListener) return true;
		if (e.preventDefault) e.preventDefault();
    	else e.returnValue = false;
    	if (exp) {
			if (op == 0) {
				exp.close();
			} else {
				songajax.previousOrNext(exp.key, op);
			}
			return false;
		}
	}
	return true;
},
registerOverlay : function (overlay) {
	songajax.push(songajax.overlays, songajax.extend(overlay, { songajaxId: 'songajaxId'+ songajax.idCounter++ } ));
},
getWrapperKey : function (element, expOnly) {
	var el, re = /^songajax-wrapper-([0-9]+)$/;
	// 1. look in open expanders
	el = element;
	while (el.parentNode)	{
		if (el.id && re.test(el.id)) return el.id.replace(re, "$1");
		el = el.parentNode;
	}
	// 2. look in thumbnail
	if (!expOnly) {
		el = element;
		while (el.parentNode)	{
			if (el.tagName && songajax.issongajaxAnchor(el)) {
				for (var key = 0; key < songajax.expanders.length; key++) {
					var exp = songajax.expanders[key];
					if (exp && exp.a == el) return key;
				}
			}
			el = el.parentNode;
		}
	}
	return null; 
},
getExpander : function (el, expOnly) {
	if (typeof el == 'undefined') return songajax.expanders[songajax.focusKey] || null;
	if (typeof el == 'number') return songajax.expanders[el] || null;
	if (typeof el == 'string') el = songajax.$(el);
	return songajax.expanders[songajax.getWrapperKey(el, expOnly)] || null;
},
issongajaxAnchor : function (a) {
	return (a.onclick && a.onclick.toString().replace(/\s/g, ' ').match(/songajax.(htmlE|e)xpand/));
},
reOrder : function () {
	for (var i = 0; i < songajax.expanders.length; i++)
		if (songajax.expanders[i] && songajax.expanders[i].isExpanded) songajax.focusTopmost();
},
mouseClickHandler : function(e) 
{	
	if (!e) e = window.event;
	if (e.button > 1) return true;
	if (!e.target) e.target = e.srcElement;
	var el = e.target;
	while (el.parentNode
		&& !(/songajax-(image|move|html|resize)/.test(el.className)))
	{
		el = el.parentNode;
	}
	var exp = songajax.getExpander(el);
	if (exp && (exp.isClosing || !exp.isExpanded)) return true;
	if (exp && e.type == 'mousedown') {
		if (e.target.form) return true;
		var match = el.className.match(/songajax-(image|move|resize)/);
		if (match) {
			songajax.dragArgs = { exp: exp , type: match[1], left: exp.x.pos, width: exp.x.size, top: exp.y.pos, 
				height: exp.y.size, clickX: e.clientX, clickY: e.clientY };
			songajax.addEventListener(document, 'mousemove', songajax.dragHandler);
			if (e.preventDefault) e.preventDefault(); // FF
			if (/songajax-(image|html)-blur/.test(exp.content.className)) {
				exp.focus();
				songajax.hasFocused = true;
			}
			return false;
		}
		else if (/songajax-html/.test(el.className) && songajax.focusKey != exp.key) {
			exp.focus();
			exp.doShowHide('hidden');
		}
	} else if (e.type == 'mouseup') {
		songajax.removeEventListener(document, 'mousemove', songajax.dragHandler);
		if (songajax.dragArgs) {
			if (songajax.styleRestoreCursor && songajax.dragArgs.type == 'image') 
				songajax.dragArgs.exp.content.style.cursor = songajax.styleRestoreCursor;
			var hasDragged = songajax.dragArgs.hasDragged;
			if (!hasDragged &&!songajax.hasFocused && !/(move|resize)/.test(songajax.dragArgs.type)) {
				exp.close();
			} 
			else if (hasDragged || (!hasDragged && songajax.hasHtmlExpanders)) {
				songajax.dragArgs.exp.doShowHide('hidden');
			}
			if (songajax.dragArgs.exp.releaseMask) 
				songajax.dragArgs.exp.releaseMask.style.display = 'none';
			songajax.hasFocused = false;
			songajax.dragArgs = null;
		} else if (/songajax-image-blur/.test(el.className)) {
			el.style.cursor = songajax.styleRestoreCursor;		
		}
	}
	return false;
},
dragHandler : function(e)
{
	if (!songajax.dragArgs) return true;
	if (!e) e = window.event;
	var a = songajax.dragArgs, exp = a.exp;
	if (exp.iframe) {		
		if (!exp.releaseMask) exp.releaseMask = songajax.createElement('div', null, 
			{ position: 'absolute', width: exp.x.size+'px', height: exp.y.size+'px', 
				left: exp.x.cb+'px', top: exp.y.cb+'px', zIndex: 4,	background: (songajax.ie ? 'white' : 'none'), 
				opacity: .01 }, 
			exp.wrapper, true);
		if (exp.releaseMask.style.display == 'none')
			exp.releaseMask.style.display = '';
	}
	a.dX = e.clientX - a.clickX;
	a.dY = e.clientY - a.clickY;	
	var distance = Math.sqrt(Math.pow(a.dX, 2) + Math.pow(a.dY, 2));
	if (!a.hasDragged) a.hasDragged = (a.type != 'image' && distance > 0)
		|| (distance > (songajax.dragSensitivity || 5));
	if (a.hasDragged && e.clientX > 5 && e.clientY > 5) {
		if (a.type == 'resize') exp.resize(a);
		else {
			exp.moveTo(a.left + a.dX, a.top + a.dY);
			if (a.type == 'image') exp.content.style.cursor = 'move';
		}
	}
	return false;
},
wrapperMouseHandler : function (e) {
	try {
		if (!e) e = window.event;
		var over = /mouseover/i.test(e.type); 
		if (!e.target) e.target = e.srcElement; // ie
		if (songajax.ie) e.relatedTarget = 
			over ? e.fromElement : e.toElement; // ie
		var exp = songajax.getExpander(e.target);
		if (!exp.isExpanded) return;
		if (!exp || !e.relatedTarget || songajax.getExpander(e.relatedTarget, true) == exp 
			|| songajax.dragArgs) return;
		for (var i = 0; i < exp.overlays.length; i++) (function() {
			var o = songajax.$('songajaxId'+ exp.overlays[i]);
			if (o && o.hideOnMouseOut) {
				if (over) songajax.setStyles(o, { visibility: 'visible', display: '' });
				songajax.animate(o, { opacity: over ? o.opacity : 0 }, o.dur);
			}
		})();	
	} catch (e) {}
},
addEventListener : function (el, event, func) {
	if (el == document && event == 'ready') songajax.push(songajax.onReady, func);
	try {
		el.addEventListener(event, func, false);
	} catch (e) {
		try {
			el.detachEvent('on'+ event, func);
			el.attachEvent('on'+ event, func);
		} catch (e) {
			el['on'+ event] = func;
		}
	} 
},
removeEventListener : function (el, event, func) {
	try {
		el.removeEventListener(event, func, false);
	} catch (e) {
		try {
			el.detachEvent('on'+ event, func);
		} catch (e) {
			el['on'+ event] = null;
		}
	}
},
preloadFullImage : function (i) {
	if (songajax.continuePreloading && songajax.preloadTheseImages[i] && songajax.preloadTheseImages[i] != 'undefined') {
		var img = document.createElement('img');
		img.onload = function() { 
			img = null;
			songajax.preloadFullImage(i + 1);
		};
		img.src = songajax.preloadTheseImages[i];
	}
},
preloadImages : function (number) {
	if (number && typeof number != 'object') songajax.numberOfImagesToPreload = number;
	var arr = songajax.getAnchors();
	for (var i = 0; i < arr.images.length && i < songajax.numberOfImagesToPreload; i++) {
		songajax.push(songajax.preloadTheseImages, songajax.getSrc(arr.images[i]));
	}
	if (songajax.outlineType)	new songajax.Outline(songajax.outlineType, function () { songajax.preloadFullImage(0)} );
	else
	songajax.preloadFullImage(0);
	if (songajax.restoreCursor) var cur = songajax.createElement('img', { src: songajax.picsDir + songajax.restoreCursor });
},
init : function () {
	if (!songajax.container) {
		songajax.getPageSize();
		songajax.ieLt7 = songajax.ie && songajax.uaVersion < 7;
		songajax.ie6SSL = songajax.ieLt7 && location.protocol == 'https:';
		for (var x in songajax.langDefaults) {
			if (typeof songajax[x] != 'undefined') songajax.lang[x] = songajax[x];
			else if (typeof songajax.lang[x] == 'undefined' && typeof songajax.langDefaults[x] != 'undefined') 
				songajax.lang[x] = songajax.langDefaults[x];
		}
		songajax.container = songajax.createElement('div', {
				className: 'songajax-container'
			}, {
				position: 'absolute', 
				left: 0, 
				top: 0, 
				width: '100%', 
				zIndex: songajax.zIndexCounter,
				direction: 'ltr'
			}, 
			document.body,
			true
		);
		songajax.loading = songajax.createElement('a', {
				className: 'songajax-loading',
				title: songajax.lang.loadingTitle,
				innerHTML: songajax.lang.loadingText,
				href: 'javascript:;'
			}, {
				position: 'absolute',
				top: '-9999px',
				opacity: songajax.loadingOpacity,
				zIndex: 1
			}, songajax.container
		);
		songajax.garbageBin = songajax.createElement('div', null, { display: 'none' }, songajax.container);
		songajax.clearing = songajax.createElement('div', null, 
			{ clear: 'both', paddingTop: '1px' }, null, true);
		Math.linearTween = function (t, b, c, d) {
			return c*t/d + b;
		};
		Math.easeInQuad = function (t, b, c, d) {
			return c*(t/=d)*t + b;
		};
		songajax.hideSelects = songajax.ieLt7;
		songajax.hideIframes = ((window.opera && songajax.uaVersion < 9) || navigator.vendor == 'KDE' 
			|| (songajax.ie && songajax.uaVersion < 5.5));
	}
},
ready : function() {
	if (songajax.isReady) return;
	songajax.isReady = true;
	for (var i = 0; i < songajax.onReady.length; i++) songajax.onReady[i]();
},
updateAnchors : function() {
	var el, els, all = [], images = [], htmls = [],groups = {}, re;
	for (var i = 0; i < songajax.openerTagNames.length; i++) {
		els = document.getElementsByTagName(songajax.openerTagNames[i]);
		for (var j = 0; j < els.length; j++) {
			el = els[j];
			re = songajax.issongajaxAnchor(el);
			if (re) {
				songajax.push(all, el);
				if (re[0] == 'songajax.expand') songajax.push(images, el);
				else if (re[0] == 'songajax.htmlExpand') songajax.push(htmls, el);
				var g = songajax.getParam(el, 'slideshowGroup') || 'none';
				if (!groups[g]) groups[g] = [];
				songajax.push(groups[g], el);
			}
		}
	}
	songajax.anchors = { all: all, groups: groups, images: images, htmls: htmls };
	return songajax.anchors;
},
getAnchors : function() {
	return songajax.anchors || songajax.updateAnchors();
},
close : function(el) {
	var exp = songajax.getExpander(el);
	if (exp) exp.close();
	return false;
}
}; // end songajax object
songajax.fx = function( elem, options, prop ){
	this.options = options;
	this.elem = elem;
	this.prop = prop;
	if (!options.orig) options.orig = {};
};
songajax.fx.prototype = {
	update: function(){
		(songajax.fx.step[this.prop] || songajax.fx.step._default)(this);
		if (this.options.step)
			this.options.step.call(this.elem, this.now, this);
	},
	custom: function(from, to, unit){
		this.startTime = (new Date()).getTime();
		this.start = from;
		this.end = to;
		this.unit = unit;// || this.unit || "px";
		this.now = this.start;
		this.pos = this.state = 0;
		var self = this;
		function t(gotoEnd){
			return self.step(gotoEnd);
		}
		t.elem = this.elem;
		if ( t() && songajax.timers.push(t) == 1 ) {
			songajax.timerId = setInterval(function(){
				var timers = songajax.timers;
				for ( var i = 0; i < timers.length; i++ )
					if ( !timers[i]() )
						timers.splice(i--, 1);
				if ( !timers.length ) {
					clearInterval(songajax.timerId);
				}
			}, 13);
		}
	},
	step: function(gotoEnd){
		var t = (new Date()).getTime();
		if ( gotoEnd || t >= this.options.duration + this.startTime ) {
			this.now = this.end;
			this.pos = this.state = 1;
			this.update();
			this.options.curAnim[ this.prop ] = true;
			var done = true;
			for ( var i in this.options.curAnim )
				if ( this.options.curAnim[i] !== true )
					done = false;
			if ( done ) {
				if (this.options.complete) this.options.complete.call(this.elem);
			}
			return false;
		} else {
			var n = t - this.startTime;
			this.state = n / this.options.duration;
			this.pos = this.options.easing(n, 0, 1, this.options.duration);
			this.now = this.start + ((this.end - this.start) * this.pos);
			this.update();
		}
		return true;
	}
};
songajax.extend( songajax.fx, {
	step: {
		opacity: function(fx){
			songajax.setStyles(fx.elem, { opacity: fx.now });
		},
		_default: function(fx){
			if ( fx.elem.style && fx.elem.style[ fx.prop ] != null )
				fx.elem.style[ fx.prop ] = fx.now + fx.unit;
			else
				fx.elem[ fx.prop ] = fx.now;
		}
	}
});
songajax.Outline =  function (outlineType, onLoad) {
	this.onLoad = onLoad;
	this.outlineType = outlineType;
	var v = songajax.uaVersion, tr;
	this.hasAlphaImageLoader = songajax.ie && v >= 5.5 && v < 7;
	if (!outlineType) {
		if (onLoad) onLoad();
		return;
	}
	songajax.init();
	this.table = songajax.createElement(
		'table', { 
			cellSpacing: 0 
		}, {
			visibility: 'hidden',
			position: 'absolute',
			borderCollapse: 'collapse',
			width: 0
		},
		songajax.container,
		true
	);
	var tbody = songajax.createElement('tbody', null, null, this.table, 1);
	this.td = [];
	for (var i = 0; i <= 8; i++) {
		if (i % 3 == 0) tr = songajax.createElement('tr', null, { height: 'auto' }, tbody, true);
		this.td[i] = songajax.createElement('td', null, null, tr, true);
		var style = i != 4 ? { lineHeight: 0, fontSize: 0} : { position : 'relative' };
		songajax.setStyles(this.td[i], style);
	}
	this.td[4].className = outlineType +' songajax-outline';
	this.preloadGraphic(); 
};
songajax.Outline.prototype = {
preloadGraphic : function () {
	var src = songajax.picsDir + this.outlineType +".png";
	var appendTo = songajax.safari ? songajax.container : null;
	this.graphic = songajax.createElement('img', null, { position: 'absolute', 
		top: '-9999px' }, appendTo, true); // for onload trigger
	var pThis = this;
	this.graphic.onload = function() { pThis.onGraphicLoad(); };
	this.graphic.src = src;
},
onGraphicLoad : function () {
	var o = this.offset = this.graphic.width / 4,
		pos = [[0,0],[0,-4],[-2,0],[0,-8],0,[-2,-8],[0,-2],[0,-6],[-2,-2]],
		dim = { height: (2*o) +'px', width: (2*o) +'px' };
	for (var i = 0; i <= 8; i++) {
		if (pos[i]) {
			if (this.hasAlphaImageLoader) {
				var w = (i == 1 || i == 7) ? '100%' : this.graphic.width +'px';
				var div = songajax.createElement('div', null, { width: '100%', height: '100%', position: 'relative', overflow: 'hidden'}, this.td[i], true);
				songajax.createElement ('div', null, { 
						filter: "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src='"+ this.graphic.src + "')", 
						position: 'absolute',
						width: w, 
						height: this.graphic.height +'px',
						left: (pos[i][0]*o)+'px',
						top: (pos[i][1]*o)+'px'
					}, 
				div,
				true);
			} else {
				songajax.setStyles(this.td[i], { background: 'url('+ this.graphic.src +') '+ (pos[i][0]*o)+'px '+(pos[i][1]*o)+'px'});
			}
			if (window.opera && (i == 3 || i ==5)) 
				songajax.createElement('div', null, dim, this.td[i], true);
			songajax.setStyles (this.td[i], dim);
		}
	}
	this.graphic = null;
	if (songajax.pendingOutlines[this.outlineType]) songajax.pendingOutlines[this.outlineType].destroy();
	songajax.pendingOutlines[this.outlineType] = this;
	if (this.onLoad) this.onLoad();
},
setPosition : function (pos, offset, vis, dur, easing) {
	var exp = this.exp,
		stl = exp.wrapper.style,
		offset = offset || 0,
		pos = pos || {
			x: exp.x.pos + offset,
			y: exp.y.pos + offset,
			w: exp.x.get('wsize') - 2 * offset,
			h: exp.y.get('wsize') - 2 * offset
		};
	if (vis) this.table.style.visibility = (pos.h >= 4 * this.offset) 
		? 'visible' : 'hidden';
	songajax.setStyles(this.table, {
		left: (pos.x - this.offset) +'px',
		top: (pos.y - this.offset) +'px',
		width: (pos.w + 2 * this.offset) +'px'
	});
	pos.w -= 2 * this.offset;
	pos.h -= 2 * this.offset;
	songajax.setStyles (this.td[4], {
		width: pos.w >= 0 ? pos.w +'px' : 0,
		height: pos.h >= 0 ? pos.h +'px' : 0
	});
	if (this.hasAlphaImageLoader) this.td[3].style.height 
		= this.td[5].style.height = this.td[4].style.height;	
},
destroy : function(hide) {
	if (hide) this.table.style.visibility = 'hidden';
	else songajax.discardElement(this.table);
}
};
songajax.Dimension = function(exp, dim) {
	this.exp = exp;
	this.dim = dim;
	this.ucwh = dim == 'x' ? 'Width' : 'Height';
	this.wh = this.ucwh.toLowerCase();
	this.uclt = dim == 'x' ? 'Left' : 'Top';
	this.lt = this.uclt.toLowerCase();
	this.ucrb = dim == 'x' ? 'Right' : 'Bottom';
	this.rb = this.ucrb.toLowerCase();
	this.p1 = this.p2 = 0;
};
songajax.Dimension.prototype = {
get : function(key) {
	switch (key) {
		case 'loadingPos':
			return this.tpos + this.tb + (this.t - songajax.loading['offset'+ this.ucwh]) / 2;
		case 'wsize':
			return this.size + 2 * this.cb + this.p1 + this.p2;
		case 'fitsize':
			return this.clientSize - this.marginMin - this.marginMax;
		case 'maxsize':
			return this.get('fitsize') - 2 * this.cb - this.p1 - this.p2 ;
		case 'opos':
			return this.pos - (this.exp.outline ? this.exp.outline.offset : 0);
		case 'osize':
			return this.get('wsize') + (this.exp.outline ? 2*this.exp.outline.offset : 0);
		case 'imgPad':
			return this.imgSize ? Math.round((this.size - this.imgSize) / 2) : 0;
	}
},
calcBorders: function() {
	this.cb = (this.exp.content['offset'+ this.ucwh] - this.t) / 2;
	this.marginMax = songajax['margin'+ this.ucrb];
},
calcThumb: function() {
	this.t = this.exp.el[this.wh] ? parseInt(this.exp.el[this.wh]) : 
		this.exp.el['offset'+ this.ucwh];
	this.tpos = this.exp.tpos[this.dim];
	this.tb = (this.exp.el['offset'+ this.ucwh] - this.t) / 2;
	if (this.tpos < 1) {
		this.tpos = (songajax.page[this.wh] / 2) + songajax.page['scroll'+ this.uclt];		
	};
},
calcExpanded: function() {
	var exp = this.exp;
	this.justify = 'auto';
	this.pos = this.tpos - this.cb + this.tb;
	this.size = Math.min(this.full, exp['max'+ this.ucwh] || this.full);
	this.minSize = exp.allowSizeReduction ? 
		Math.min(exp['min'+ this.ucwh], this.full) :this.full;
	if (exp.isImage && exp.useBox)	{
		this.size = exp[this.wh];
		this.imgSize = this.full;
	}
	if (this.dim == 'x' && songajax.padToMinWidth) this.minSize = exp.minWidth;
	this.marginMin = songajax['margin'+ this.uclt];
	this.scroll = songajax.page['scroll'+ this.uclt];
	this.clientSize = songajax.page[this.wh];
},
setSize: function(i) {
	var exp = this.exp;
	if (exp.isImage && (exp.useBox || songajax.padToMinWidth)) {
		this.imgSize = i;
		this.size = Math.max(this.size, this.imgSize);
		exp.content.style[this.lt] = this.get('imgPad')+'px';
	} else
	this.size = i;
	exp.content.style[this.wh] = i +'px';
	exp.wrapper.style[this.wh] = this.get('wsize') +'px';
	if (exp.outline) exp.outline.setPosition();
	if (exp.releaseMask) exp.releaseMask.style[this.wh] = i +'px';
	if (exp.isHtml) {
		var d = exp.scrollerDiv;
		if (this.sizeDiff === undefined)
			this.sizeDiff = exp.innerContent['offset'+ this.ucwh] - d['offset'+ this.ucwh];
		d.style[this.wh] = (this.size - this.sizeDiff) +'px';
		if (this.dim == 'x') exp.mediumContent.style.width = 'auto';
		if (exp.body) exp.body.style[this.wh] = 'auto';
	}
	if (this.dim == 'x' && exp.overlayBox) exp.sizeOverlayBox(true);
},
setPos: function(i) {
	this.pos = i;
	this.exp.wrapper.style[this.lt] = i +'px';	
	if (this.exp.outline) this.exp.outline.setPosition();
}
};
songajax.Expander = function(a, params, custom, contentType) {
	if (document.readyState && songajax.ie && !songajax.isReady) {
		songajax.addEventListener(document, 'ready', function() {
			new songajax.Expander(a, params, custom, contentType);
		});
		return;
	} 
	this.a = a;
	this.custom = custom;
	this.contentType = contentType || 'image';
	this.isHtml = (contentType == 'html');
	this.isImage = !this.isHtml;
	songajax.continuePreloading = false;
	this.overlays = [];
	songajax.init();
	var key = this.key = songajax.expanders.length;
	for (var i = 0; i < songajax.overrides.length; i++) {
		var name = songajax.overrides[i];
		this[name] = params && typeof params[name] != 'undefined' ?
			params[name] : songajax[name];
	}
	if (!this.src) this.src = a.href;
	var el = (params && params.thumbnailId) ? songajax.$(params.thumbnailId) : a;
	el = this.thumb = el.getElementsByTagName('img')[0] || el;
	this.thumbsUserSetId = el.id || a.id;
	for (var i = 0; i < songajax.expanders.length; i++) {
		if (songajax.expanders[i] && songajax.expanders[i].a == a) {
			songajax.expanders[i].focus();
			return false;
		}
	}	
	if (!songajax.allowSimultaneousLoading) for (var i = 0; i < songajax.expanders.length; i++) {
		if (songajax.expanders[i] && songajax.expanders[i].thumb != el && !songajax.expanders[i].onLoadStarted) {
			songajax.expanders[i].cancelLoading();
		}
	}
	songajax.expanders[key] = this;
	if (!songajax.allowMultipleInstances && !songajax.upcoming) {
		if (songajax.expanders[key-1]) songajax.expanders[key-1].close();
		if (typeof songajax.focusKey != 'undefined' && songajax.expanders[songajax.focusKey])
			songajax.expanders[songajax.focusKey].close();
	}
	this.el = el;
	this.tpos = songajax.getPosition(el);
	songajax.getPageSize();
	var x = this.x = new songajax.Dimension(this, 'x');
	x.calcThumb();
	var y = this.y = new songajax.Dimension(this, 'y');
	y.calcThumb();
	this.wrapper = songajax.createElement(
		'div', {
			id: 'songajax-wrapper-'+ this.key,
			className: 'songajax-wrapper '+ this.wrapperClassName
		}, {
			visibility: 'hidden',
			position: 'absolute',
			zIndex: songajax.zIndexCounter += 2
		}, null, true );
	this.wrapper.onmouseover = this.wrapper.onmouseout = songajax.wrapperMouseHandler;
	if (this.contentType == 'image' && this.outlineWhileAnimating == 2)
		this.outlineWhileAnimating = 0;
	if (!this.outlineType) {
		this[this.contentType +'Create']();
	} else if (songajax.pendingOutlines[this.outlineType]) {
		this.connectOutline();
		this[this.contentType +'Create']();
	} else {
		this.showLoading();
		var exp = this;
		new songajax.Outline(this.outlineType, 
			function () {
				exp.connectOutline();
				exp[exp.contentType +'Create']();
			} 
		);
	}
	return true;
};
songajax.Expander.prototype = {
error : function(e) {
	window.location.href = this.src;
},
connectOutline : function() {
	var outline = this.outline = songajax.pendingOutlines[this.outlineType];
	outline.exp = this;
	outline.table.style.zIndex = this.wrapper.style.zIndex - 1;
	songajax.pendingOutlines[this.outlineType] = null;
},
showLoading : function() {
	if (this.onLoadStarted || this.loading) return;
	this.loading = songajax.loading;
	var exp = this;
	this.loading.onclick = function() {
		exp.cancelLoading();
	};
	var exp = this, 
		l = this.x.get('loadingPos') +'px',
		t = this.y.get('loadingPos') +'px';
	setTimeout(function () { 
		if (exp.loading) songajax.setStyles(exp.loading, { left: l, top: t, zIndex: songajax.zIndexCounter++ })}
	, 100);
},
imageCreate : function() {
	var exp = this;
	var img = document.createElement('img');
    this.content = img;
    img.onload = function () {
    	if (songajax.expanders[exp.key]) exp.contentLoaded(); 
	};
    if (songajax.blockRightClick) img.oncontextmenu = function() { return false; };
    img.className = 'songajax-image';
    songajax.setStyles(img, {
    	visibility: 'hidden',
    	display: 'block',
    	position: 'absolute',
		maxWidth: '9999px',
		zIndex: 3
	});
    img.title = songajax.lang.restoreTitle;
    if (songajax.safari) songajax.container.appendChild(img);
    if (songajax.ie && songajax.flushImgSize) img.src = null;
	img.src = this.src;
	this.showLoading();
},
htmlCreate : function () {
	this.content = songajax.getCacheBinding(this.a);
	if (!this.content) 
		this.content = songajax.getNode(this.contentId);
	if (!this.content) 
		this.content = songajax.getSelfRendered();
	this.getInline(['maincontent']);
	if (this.maincontent) {
		var body = songajax.getElementByClass(this.content, 'div', 'songajax-body');
		if (body) body.appendChild(this.maincontent);
		this.maincontent.style.display = 'block';
	}
	var innerContent = this.innerContent = this.content;
	if (/(swf|iframe)/.test(this.objectType)) this.setObjContainerSize(innerContent);
	songajax.container.appendChild(this.wrapper);
	songajax.setStyles( this.wrapper, { 
		position: 'static',
		padding: '0 '+ songajax.marginRight +'px 0 '+ songajax.marginLeft +'px'
	});
	this.content = songajax.createElement(
    	'div', {
    		className: 'songajax-html' 
    	}, {
			position: 'relative',
			zIndex: 3,
			overflow: 'hidden'
		},
		this.wrapper
	);
	this.mediumContent = songajax.createElement('div', null, null, this.content, 1);
	this.mediumContent.appendChild(innerContent);
	songajax.setStyles (innerContent, { 
		position: 'relative',
		display: 'block',
		direction: songajax.lang.cssDirection || ''
	});
	if (this.width) innerContent.style.width = this.width +'px';
	if (this.height) songajax.setStyles(innerContent, {
		height: this.height +'px',
		overflow: 'hidden'
	});
	if (innerContent.offsetWidth < this.minWidth)
		innerContent.style.width = this.minWidth +'px';
	if (this.objectType == 'ajax' && !songajax.getCacheBinding(this.a)) {
		this.showLoading();
    	var ajax = new songajax.Ajax(this.a, innerContent);
    	var exp = this;
    	ajax.onLoad = function () {	if (songajax.expanders[exp.key]) exp.contentLoaded(); };
    	ajax.onError = function () { location.href = exp.src; };
    	ajax.run();
	}
    else
    if (this.objectType == 'iframe' && this.objectLoadTime == 'before') {
		this.writeExtendedContent();
	}
    else
    	this.contentLoaded();
},
contentLoaded : function() {
	try {	
		if (!this.content) return;
		this.content.onload = null;
		if (this.onLoadStarted) return;
		else this.onLoadStarted = true;
		var x = this.x, y = this.y;
		if (this.loading) {
			songajax.setStyles(this.loading, { top: '-9999px' });
			this.loading = null;
		}
		if (this.isImage) {	
			x.full = this.content.width;
			y.full = this.content.height;
			songajax.setStyles(this.content, {
				width: x.t +'px',
				height: y.t +'px'
			});
			this.wrapper.appendChild(this.content);
			songajax.container.appendChild(this.wrapper);
		} else if (this.htmlGetSize) this.htmlGetSize();
		x.calcBorders();
		y.calcBorders();
		songajax.setStyles (this.wrapper, {
			left: (x.tpos + x.tb - x.cb) +'px',
			top: (y.tpos + x.tb - y.cb) +'px'
		});
		this.getOverlays();
		var ratio = x.full / y.full;
		x.calcExpanded();
		this.justify(x);
		y.calcExpanded();
		this.justify(y);
		if (this.isHtml) this.htmlSizeOperations();
		if (this.overlayBox) this.sizeOverlayBox(0, 1);
		if (this.allowSizeReduction) {
			if (this.isImage)
				this.correctRatio(ratio);
			else this.fitOverlayBox();
			if (this.isImage && this.x.full > (this.x.imgSize || this.x.size)) {
				this.createFullExpand();
				if (this.overlays.length == 1) this.sizeOverlayBox();
			}
		}
		this.show();
	} catch (e) {
		this.error(e);
	}
},
setObjContainerSize : function(parent, auto) {
	var c = songajax.getElementByClass(parent, 'DIV', 'songajax-body');
	if (/(iframe|swf)/.test(this.objectType)) {
		if (this.objectWidth) c.style.width = this.objectWidth +'px';
		if (this.objectHeight) c.style.height = this.objectHeight +'px';
	}
},
//框架
writeExtendedContent : function () {
	if (this.hasExtendedContent) return;
	var exp = this;
	this.body = songajax.getElementByClass(this.innerContent, 'DIV', 'songajax-body');
	if (this.objectType == 'iframe') {
		this.showLoading();
		var ruler = songajax.clearing.cloneNode(1);
		this.body.appendChild(ruler);
		this.newWidth = this.innerContent.offsetWidth;
		if (!this.objectWidth) this.objectWidth = ruler.offsetWidth;
		var hDiff = this.innerContent.offsetHeight - this.body.offsetHeight,
			h = this.objectHeight || songajax.page.height - hDiff - songajax.marginTop - songajax.marginBottom,
			onload = this.objectLoadTime == 'before' ? 
				' onload="if (songajax.expanders['+ this.key +']) songajax.expanders['+ this.key +'].contentLoaded()" ' : '';
		this.body.innerHTML += '<iframe name="songajax'+ (new Date()).getTime() +'" frameborder="0" key="'+ this.key +'" '
			+' allowtransparency="true" style="width:'+ this.objectWidth +'px; height:'+ h +'px" '
			+ onload +' src="'+ this.src +'"></iframe>';
		this.ruler = this.body.getElementsByTagName('div')[0];
		this.iframe = this.body.getElementsByTagName('iframe')[0];
		if (this.objectLoadTime == 'after') this.correctIframeSize();
	}
	if (this.objectType == 'swf') {
		this.body.id = this.body.id || 'songajax-flash-id-' + this.key;
		var a = this.swfOptions;
		if (!a.params) a.params = {};
		if (typeof a.params.wmode == 'undefined') a.params.wmode = 'transparent';
		if (swfobject) swfobject.embedSWF(this.src, this.body.id, this.objectWidth, this.objectHeight, 
			a.version || '7', a.expressInstallSwfurl, a.flashvars, a.params, a.attributes);
	}
	this.hasExtendedContent = true;
},
htmlGetSize : function() {
	if (this.iframe && !this.objectHeight) { 		
		this.iframe.style.height = this.body.style.height = this.getIframePageHeight() +'px';
	}
	this.innerContent.appendChild(songajax.clearing);
	if (!this.x.full) this.x.full = this.innerContent.offsetWidth;
    this.y.full = this.innerContent.offsetHeight;
    this.innerContent.removeChild(songajax.clearing);
    if (songajax.ie && this.newHeight > parseInt(this.innerContent.currentStyle.height)) {
		this.newHeight = parseInt(this.innerContent.currentStyle.height);
	}
	songajax.setStyles( this.wrapper, { position: 'absolute',	padding: '0'});
	songajax.setStyles( this.content, { width: this.x.t +'px', height: this.y.t +'px'});
},
getIframePageHeight : function() {
	var h;
	try {
		var doc = this.iframe.contentDocument || this.iframe.contentWindow.document;
		var clearing = doc.createElement('div');
		clearing.style.clear = 'both';
		doc.body.appendChild(clearing);
		h = clearing.offsetTop;
		if (songajax.ie) h += parseInt(doc.body.currentStyle.marginTop) 
			+ parseInt(doc.body.currentStyle.marginBottom) - 1;
	} catch (e) { 
		h = 300;
	}
	return h;
},
correctIframeSize : function () {
	var wDiff = this.innerContent.offsetWidth - this.ruler.offsetWidth;
	songajax.discardElement(this.ruler);
	if (wDiff < 0) wDiff = 0;
	var hDiff = this.innerContent.offsetHeight - this.iframe.offsetHeight;
	songajax.setStyles(this.iframe, { 
		width: Math.abs(this.x.size - wDiff) +'px', 
		height: Math.abs(this.y.size - hDiff) +'px'
	});
    songajax.setStyles(this.body, { 
		width: this.iframe.style.width, 
    	height: this.iframe.style.height
	});
    this.scrollingContent = this.iframe;
    this.scrollerDiv = this.scrollingContent;
},
htmlSizeOperations : function () {
	this.setObjContainerSize(this.innerContent);
	if (this.objectType == 'swf' && this.objectLoadTime == 'before') this.writeExtendedContent();	
	if (this.x.size < this.x.full && !this.allowWidthReduction) this.x.size = this.x.full;
    if (this.y.size < this.y.full && !this.allowHeightReduction) this.y.size = this.y.full;
	this.scrollerDiv = this.innerContent;
    songajax.setStyles(this.mediumContent, { 
		position: 'relative',
		width: this.x.size +'px'
	});
    songajax.setStyles(this.innerContent, { 
    	border: 'none',
    	width: 'auto',
    	height: 'auto'
    });
	var node = songajax.getElementByClass(this.innerContent, 'DIV', 'songajax-body');
    if (node && !/(iframe|swf)/.test(this.objectType)) {
    	var cNode = node; // wrap to get true size
    	node = songajax.createElement(cNode.nodeName, null, {overflow: 'hidden'}, null, true);
    	cNode.parentNode.insertBefore(node, cNode);
    	node.appendChild(songajax.clearing); // IE6
    	node.appendChild(cNode);
    	var wDiff = this.innerContent.offsetWidth - node.offsetWidth;
    	var hDiff = this.innerContent.offsetHeight - node.offsetHeight;
		node.removeChild(songajax.clearing);
    	var kdeBugCorr = songajax.safari || navigator.vendor == 'KDE' ? 1 : 0; // KDE repainting bug
    	songajax.setStyles(node, { 
    			width: (this.x.size - wDiff - kdeBugCorr) +'px', 
    			height: (this.y.size - hDiff) +'px',
    			overflow: 'auto', 
    			position: 'relative' 
    		} 
    	);
		if (kdeBugCorr && cNode.offsetHeight > node.offsetHeight)	{
    		node.style.width = (parseInt(node.style.width) + kdeBugCorr) + 'px';
		}
    	this.scrollingContent = node;
    	this.scrollerDiv = this.scrollingContent;
	}
    if (this.iframe && this.objectLoadTime == 'before') this.correctIframeSize();
    if (!this.scrollingContent && this.y.size < this.mediumContent.offsetHeight) this.scrollerDiv = this.content;
	if (this.scrollerDiv == this.content && !this.allowWidthReduction && !/(iframe|swf)/.test(this.objectType)) {
		this.x.size += 17; // room for scrollbars
	}
	if (this.scrollerDiv && this.scrollerDiv.offsetHeight > this.scrollerDiv.parentNode.offsetHeight) {
		setTimeout("try { songajax.expanders["+ this.key +"].scrollerDiv.style.overflow = 'auto'; } catch(e) {}",
			 songajax.expandDuration);
	}
},
justify : function (p, moveOnly) {
	var tgtArr, tgt = p.target, dim = p == this.x ? 'x' : 'y';
		var hasMovedMin = false;
		var allowReduce = p.exp.allowSizeReduction;
			p.pos = Math.round(p.pos - ((p.get('wsize') - p.t) / 2));
		if (p.pos < p.scroll + p.marginMin) {
			p.pos = p.scroll + p.marginMin;
			hasMovedMin = true;		
		}
		if (!moveOnly && p.size < p.minSize) {
			p.size = p.minSize;
			allowReduce = false;
		}
		if (p.pos + p.get('wsize') > p.scroll + p.clientSize - p.marginMax) {
			if (!moveOnly && hasMovedMin && allowReduce) {
				p.size = p.get(dim == 'y' ? 'fitsize' : 'maxsize');
			} else if (p.get('wsize') < p.get('fitsize')) {
				p.pos = p.scroll + p.clientSize - p.marginMax - p.get('wsize');
			} else { // image larger than viewport
				p.pos = p.scroll + p.marginMin;
				if (!moveOnly && allowReduce) p.size = p.get(dim == 'y' ? 'fitsize' : 'maxsize');
			}			
		}
		if (!moveOnly && p.size < p.minSize) {
			p.size = p.minSize;
			allowReduce = false;
		}
	if (p.pos < p.marginMin) {
		var tmpMin = p.pos;
		p.pos = p.marginMin; 
		if (allowReduce && !moveOnly) p.size = p.size - (p.pos - tmpMin);
	}
},
correctRatio : function(ratio) {
	var x = this.x, 
		y = this.y,
		changed = false,
		xSize = Math.min(x.full, x.size),
		ySize = Math.min(y.full, y.size),
		useBox = (this.useBox || songajax.padToMinWidth);
	if (xSize / ySize > ratio) { // width greater
		xSize = ySize * ratio;
		if (xSize < x.minSize) { // below minWidth
			xSize = x.minSize;
			ySize = xSize / ratio;
		}
		changed = true;
	} else if (xSize / ySize < ratio) { // height greater
		ySize = xSize / ratio;
		changed = true;
	}
	if (songajax.padToMinWidth && x.full < x.minSize) {
		x.imgSize = x.full;
		y.size = y.imgSize = y.full;
	} else if (this.useBox) {
		x.imgSize = xSize;
		y.imgSize = ySize;
	} else {
		x.size = xSize;
		y.size = ySize;
	}
	this.fitOverlayBox(useBox ? null : ratio);
	if (useBox && y.size < y.imgSize) {
		y.imgSize = y.size;
		x.imgSize = y.size * ratio;
	}
	if (changed || useBox) {
		x.pos = x.tpos - x.cb + x.tb;
		x.minSize = x.size;
		this.justify(x, true);
		y.pos = y.tpos - y.cb + y.tb;
		y.minSize = y.size;
		this.justify(y, true);
		if (this.overlayBox) this.sizeOverlayBox();
	}
},
fitOverlayBox : function(ratio) {
	var x = this.x, y = this.y;
	if (this.overlayBox) {
		while (y.size > this.minHeight && x.size > this.minWidth 
				&&  y.get('wsize') > y.get('fitsize')) {
			y.size -= 10;
			if (ratio) x.size = y.size * ratio;
			this.sizeOverlayBox(0, 1);
		}
	}
},
show : function () {
	var x = this.x, y = this.y;
	this.doShowHide('hidden');
	// Apply size change
	this.changeSize(
		1, {
			wrapper: {
				width : x.get('wsize'),
				height : y.get('wsize'),
				left: x.pos,
				top: y.pos
			},
			content: {
				left: x.p1 + x.get('imgPad'),
				top: y.p1 + y.get('imgPad'),
				width:x.imgSize ||x.size,
				height:y.imgSize ||y.size
			}
		},
		songajax.expandDuration
	);
},
changeSize : function(up, to, dur) {
	if (this.outline && !this.outlineWhileAnimating) {
		if (up) this.outline.setPosition();
		else this.outline.destroy(
				(this.isHtml && this.preserveContent));
	}
	if (!up) this.destroyOverlays();
	var exp = this,
		x = exp.x,
		y = exp.y,
		easing = this.easing;
	if (!up) easing = this.easingClose || easing;
	var after = up ?
		function() {
			if (exp.outline) exp.outline.table.style.visibility = "visible";
			setTimeout(function() {
				exp.afterExpand();
			}, 50);
		} :
		function() {
			exp.afterClose();
		};
	if (up) songajax.setStyles( this.wrapper, {
		width: x.t +'px',
		height: y.t +'px'
	});
	if (up && this.isHtml) {
		songajax.setStyles(this.wrapper, {
			left: (x.tpos - x.cb + x.tb) +'px',
			top: (y.tpos - y.cb + y.tb) +'px'
		});
	}
	if (this.fadeInOut) {
		songajax.setStyles(this.wrapper, { opacity: up ? 0 : 1 });
		songajax.extend(to.wrapper, { opacity: up });
	}
	songajax.animate( this.wrapper, to.wrapper, {
		duration: dur,
		easing: easing,
		step: function(val, args) {
			if (exp.outline && exp.outlineWhileAnimating && args.prop == 'top') {
				var fac = up ? args.pos : 1 - args.pos;
				var pos = {
					w: x.t + (x.get('wsize') - x.t) * fac,
					h: y.t + (y.get('wsize') - y.t) * fac,
					x: x.tpos + (x.pos - x.tpos) * fac,
					y: y.tpos + (y.pos - y.tpos) * fac
				};
				exp.outline.setPosition(pos, 0, 1);				
			}
			if (exp.isHtml) {	
				if (args.prop == 'left') 
					exp.mediumContent.style.left = (x.pos - val) +'px';
				if (args.prop == 'top') 
					exp.mediumContent.style.top = (y.pos - val) +'px';
			}
		}
	});
	songajax.animate( this.content, to.content, dur, easing, after);
	if (up) {
		this.wrapper.style.visibility = 'visible';
		this.content.style.visibility = 'visible';
		if (this.isHtml) this.innerContent.style.visibility = 'visible';
		//this.a.className += ' songajax-active-anchor'; //打开窗口时隐藏a标签中的图片
	}
},
afterExpand : function() {
	this.isExpanded = true;	
	this.focus();
	if (this.isHtml && this.objectLoadTime == 'after') this.writeExtendedContent();
	if (this.iframe) {
		try {
			var exp = this,
				doc = this.iframe.contentDocument || this.iframe.contentWindow.document;
			songajax.addEventListener(doc, 'mousedown', function () {
				if (songajax.focusKey != exp.key) exp.focus();
			});
		} catch(e) {}
		if (songajax.ie && typeof this.isClosing != 'boolean') // first open 
			this.iframe.style.width = (this.objectWidth - 1) +'px'; // hasLayout
	}
	if (songajax.upcoming && songajax.upcoming == this.a) songajax.upcoming = null;
	this.prepareNextOutline();
	var p = songajax.page, mX = songajax.mouse.x + p.scrollLeft, mY = songajax.mouse.y + p.scrollTop;
	this.mouseIsOver = this.x.pos < mX && mX < this.x.pos + this.x.get('wsize')
		&& this.y.pos < mY && mY < this.y.pos + this.y.get('wsize');	
	if (this.overlayBox) this.showOverlays();
},
prepareNextOutline : function() {
	var key = this.key;
	var outlineType = this.outlineType;
	new songajax.Outline(outlineType, 
		function () { try { songajax.expanders[key].preloadNext(); } catch (e) {} });
},
preloadNext : function() {
	var next = this.getAdjacentAnchor(1);
	if (next && next.onclick.toString().match(/songajax\.expand/)) 
		var img = songajax.createElement('img', { src: songajax.getSrc(next) });
},
getAdjacentAnchor : function(op) {
	var current = this.getAnchorIndex(), as = songajax.anchors.groups[this.slideshowGroup || 'none'];
	/*< ? if ($cfg->slideshow) : ?>s*/
	if (!as[current + op] && this.slideshow && this.slideshow.repeat) {
		if (op == 1) return as[0];
		else if (op == -1) return as[as.length-1];
	}
	/*< ? endif ?>s*/
	return as[current + op] || null;
},
getAnchorIndex : function() {
	var arr = songajax.getAnchors().groups[this.slideshowGroup || 'none'];
	if (arr) for (var i = 0; i < arr.length; i++) {
		if (arr[i] == this.a) return i; 
	}
	return null;
},
cancelLoading : function() {
	songajax.discardElement (this.wrapper);
	songajax.expanders[this.key] = null;
	if (this.loading) songajax.loading.style.left = '-9999px';
},
writeCredits : function () {
	this.credits = songajax.createElement('a', {
		href: songajax.creditsHref,
		target: songajax.creditsTarget,
		className: 'songajax-credits',
		innerHTML: songajax.lang.creditsText,
		title: songajax.lang.creditsTitle
	});
	this.createOverlay({ 
		overlayId: this.credits, 
		position: this.creditsPosition || 'top left' 
	});
},
getInline : function(types, addOverlay) {
	for (var i = 0; i < types.length; i++) {
		var type = types[i], s = null;
		if (!this[type +'Id'] && this.thumbsUserSetId)  
			this[type +'Id'] = type +'-for-'+ this.thumbsUserSetId;
		if (this[type +'Id']) this[type] = songajax.getNode(this[type +'Id']);
		if (!this[type] && !this[type +'Text'] && this[type +'Eval']) try {
			s = eval(this[type +'Eval']);
		} catch (e) {}
		if (!this[type] && this[type +'Text']) {
			s = this[type +'Text'];
		}
		if (!this[type] && !s) {
			var next = this.a.nextSibling;
			while (next && !songajax.issongajaxAnchor(next)) {
				if ((new RegExp('songajax-'+ type)).test(next.className || null)) {
					this[type] = next.cloneNode(1);
					break;
				}
				next = next.nextSibling;
			}
		}
		if (!this[type] && s) this[type] = songajax.createElement('div', 
				{ className: 'songajax-'+ type, innerHTML: s } );
		if (addOverlay && this[type]) {
			var o = { position: (type == 'heading') ? 'above' : 'below' };
			for (var x in this[type+'Overlay']) o[x] = this[type+'Overlay'][x];
			o.overlayId = this[type];
			this.createOverlay(o);
		}
	}
},
doShowHide : function(visibility) {
	if (songajax.hideSelects) this.showHideElements('SELECT', visibility);
	if (songajax.hideIframes) this.showHideElements('IFRAME', visibility);
	if (songajax.geckoMac) this.showHideElements('*', visibility);
},
showHideElements : function (tagName, visibility) {
	var els = document.getElementsByTagName(tagName);
	var prop = tagName == '*' ? 'overflow' : 'visibility';
	for (var i = 0; i < els.length; i++) {
		if (prop == 'visibility' || (document.defaultView.getComputedStyle(
				els[i], "").getPropertyValue('overflow') == 'auto'
				|| els[i].getAttribute('hidden-by') != null)) {
			var hiddenBy = els[i].getAttribute('hidden-by');
			if (visibility == 'visible' && hiddenBy) {
				hiddenBy = hiddenBy.replace('['+ this.key +']', '');
				els[i].setAttribute('hidden-by', hiddenBy);
				if (!hiddenBy) els[i].style[prop] = els[i].origProp;
			} else if (visibility == 'hidden') { // hide if behind
				var elPos = songajax.getPosition(els[i]);
				elPos.w = els[i].offsetWidth;
				elPos.h = els[i].offsetHeight;
					var clearsX = (elPos.x + elPos.w < this.x.get('opos') 
						|| elPos.x > this.x.get('opos') + this.x.get('osize'));
					var clearsY = (elPos.y + elPos.h < this.y.get('opos') 
						|| elPos.y > this.y.get('opos') + this.y.get('osize'));
				var wrapperKey = songajax.getWrapperKey(els[i]);
				if (!clearsX && !clearsY && wrapperKey != this.key) { // element falls behind image
					if (!hiddenBy) {
						els[i].setAttribute('hidden-by', '['+ this.key +']');
						els[i].origProp = els[i].style[prop];
						els[i].style[prop] = 'hidden';
					} else if (hiddenBy.indexOf('['+ this.key +']') == -1) {
						els[i].setAttribute('hidden-by', hiddenBy + '['+ this.key +']');
					}
				} else if ((hiddenBy == '['+ this.key +']' || songajax.focusKey == wrapperKey)
						&& wrapperKey != this.key) { // on move
					els[i].setAttribute('hidden-by', '');
					els[i].style[prop] = els[i].origProp || '';
				} else if (hiddenBy && hiddenBy.indexOf('['+ this.key +']') > -1) {
					els[i].setAttribute('hidden-by', hiddenBy.replace('['+ this.key +']', ''));
				}
			}
		}
	}
},
focus : function() {
	this.wrapper.style.zIndex = songajax.zIndexCounter += 2;
	// blur others
	for (var i = 0; i < songajax.expanders.length; i++) {
		if (songajax.expanders[i] && i == songajax.focusKey) {
			var blurExp = songajax.expanders[i];
			blurExp.content.className += ' songajax-'+ blurExp.contentType +'-blur';
			if (blurExp.isImage) {
				blurExp.content.style.cursor = songajax.ie ? 'hand' : 'pointer';
				blurExp.content.title = songajax.lang.focusTitle;	
			}
		}
	}
	// focus this
	if (this.outline) this.outline.table.style.zIndex 
		= this.wrapper.style.zIndex - 1;
	this.content.className = 'songajax-'+ this.contentType;
	if (this.isImage) {
		this.content.title = songajax.lang.restoreTitle;
		if (songajax.restoreCursor) {
			songajax.styleRestoreCursor = window.opera ? 'pointer' : 'url('+ songajax.picsDir + songajax.restoreCursor +'), pointer';
			if (songajax.ie && songajax.uaVersion < 6) songajax.styleRestoreCursor = 'hand';
			this.content.style.cursor = songajax.styleRestoreCursor;
		}
	}
	songajax.focusKey = this.key;	
	songajax.addEventListener(document, window.opera ? 'keypress' : 'keydown', songajax.keyHandler);	
},
moveTo: function(x, y) {
	this.x.setPos(x);
	this.y.setPos(y);
},
resize : function (e) {
	var w, h, r = e.width / e.height;
	w = Math.max(e.width + e.dX, Math.min(this.minWidth, this.x.full));
	if (this.isImage && Math.abs(w - this.x.full) < 12) w = this.x.full;
	h = this.isHtml ? e.height + e.dY : w / r;
	if (h < Math.min(this.minHeight, this.y.full)) {
		h = Math.min(this.minHeight, this.y.full);
		if (this.isImage) w = h * r;
	}
	this.resizeTo(w, h);
},
resizeTo: function(w, h) {
	this.y.setSize(h);
	this.x.setSize(w);
},
close : function() {
	if (this.isClosing || !this.isExpanded) return;
	this.isClosing = true;
	songajax.removeEventListener(document, window.opera ? 'keypress' : 'keydown', songajax.keyHandler);
	try {
		if (this.isHtml) this.htmlPrepareClose();
		this.content.style.cursor = 'default';
		this.changeSize(
			0, {
				wrapper: {
					width : this.x.t,
					height : this.y.t,
					left: this.x.tpos - this.x.cb + this.x.tb,
					top: this.y.tpos - this.y.cb + this.y.tb
				},
				content: {
					left: 0,
					top: 0,
					width: this.x.t,
					height: this.y.t
				}
			}, songajax.restoreDuration
		);
	} catch (e) { this.afterClose(); }
},
htmlPrepareClose : function() {
	if (songajax.geckoMac) { // bad redraws
		if (!songajax.mask) songajax.mask = songajax.createElement('div', null, 
			{ position: 'absolute' }, songajax.container);
		songajax.setStyles(songajax.mask, { width: this.x.size +'px', height: this.y.size +'px', 
			left: this.x.pos +'px', top: this.y.pos +'px', display: 'block' });			
	}
	if (this.objectType == 'swf') try { songajax.$(this.body.id).StopPlay(); } catch (e) {}
	if (this.objectLoadTime == 'after' && !this.preserveContent) this.destroyObject();		
	if (this.scrollerDiv && this.scrollerDiv != this.scrollingContent) 
		this.scrollerDiv.style.overflow = 'hidden';
},
destroyObject : function () {
	if (songajax.ie && this.iframe)
		try { this.iframe.contentWindow.document.body.innerHTML = ''; } catch (e) {}
	if (this.objectType == 'swf') swfobject.removeSWF(this.body.id);
	this.body.innerHTML = '';
},
sleep : function() {
	if (this.outline) this.outline.table.style.display = 'none';
	this.releaseMask = null;
	this.wrapper.style.display = 'none';
	songajax.push(songajax.sleeping, this);
},
awake : function() {try {
	songajax.expanders[this.key] = this;
	if (!songajax.allowMultipleInstances &&songajax.focusKey != this.key) {	
		try { songajax.expanders[songajax.focusKey].close(); } catch (e){}
	}
	var z = songajax.zIndexCounter++, stl = { display: '', zIndex: z };
	songajax.setStyles (this.wrapper, stl);
	this.isClosing = false;
	var o = this.outline || 0;
	if (o) {
		if (!this.outlineWhileAnimating) stl.visibility = 'hidden';
		songajax.setStyles (o.table, stl);		
	}
	this.show();
} catch (e) {}
},
createOverlay : function (o) {
	var el = o.overlayId;
	if (typeof el == 'string') el = songajax.getNode(el);
	if (o.html) el = songajax.createElement('div', { innerHTML: o.html });
	if (!el || typeof el == 'string') return;
	el.style.display = 'block';
	this.genOverlayBox();
	var width = o.width && /^[0-9]+(px|%)$/.test(o.width) ? o.width : 'auto';
	if (/^(left|right)panel$/.test(o.position) && !/^[0-9]+px$/.test(o.width)) width = '200px';
	var overlay = songajax.createElement(
		'div', {
			id: 'songajaxId'+ songajax.idCounter++,
			songajaxId: o.songajaxId
		}, {
			position: 'absolute',
			visibility: 'hidden',
			width: width,
			direction: songajax.lang.cssDirection || '',
			opacity: 0
		},this.overlayBox,
		true
	);
	overlay.appendChild(el);
	songajax.extend(overlay, {
		opacity: 1,
		offsetX: 0,
		offsetY: 0,
		dur: (o.fade === 0 || o.fade === false || (o.fade == 2 && songajax.ie)) ? 0 : 250
	});
	songajax.extend(overlay, o);
	if (this.gotOverlays) {
		this.positionOverlay(overlay);
		if (!overlay.hideOnMouseOut || this.mouseIsOver) 
			songajax.animate(overlay, { opacity: overlay.opacity }, overlay.dur);
	}
	songajax.push(this.overlays, songajax.idCounter - 1);
},
positionOverlay : function(overlay) {
	var p = overlay.position || 'middle center',
		offX = overlay.offsetX,
		offY = overlay.offsetY;
	if (overlay.parentNode != this.overlayBox) this.overlayBox.appendChild(overlay);
	if (/left$/.test(p)) overlay.style.left = offX +'px'; 
	if (/center$/.test(p))	songajax.setStyles (overlay, { 
		left: '50%',
		marginLeft: (offX - Math.round(overlay.offsetWidth / 2)) +'px'
	});	
	if (/right$/.test(p)) overlay.style.right = - offX +'px';
	if (/^leftpanel$/.test(p)) { 
		songajax.setStyles(overlay, {
			right: '100%',
			marginRight: this.x.cb +'px',
			top: - this.y.cb +'px',
			bottom: - this.y.cb +'px',
			overflow: 'auto'
		});		 
		this.x.p1 = overlay.offsetWidth;
	} else if (/^rightpanel$/.test(p)) {
		songajax.setStyles(overlay, {
			left: '100%',
			marginLeft: this.x.cb +'px',
			top: - this.y.cb +'px',
			bottom: - this.y.cb +'px',
			overflow: 'auto'
		});
		this.x.p2 = overlay.offsetWidth;
	}
	if (/^top/.test(p)) overlay.style.top = offY +'px'; 
	if (/^middle/.test(p))	songajax.setStyles (overlay, { 
		top: '50%', 
		marginTop: (offY - Math.round(overlay.offsetHeight / 2)) +'px'
	});	
	if (/^bottom/.test(p)) overlay.style.bottom = - offY +'px';
	if (/^above$/.test(p)) {
		songajax.setStyles(overlay, {
			left: (- this.x.p1 - this.x.cb) +'px',
			right: (- this.x.p2 - this.x.cb) +'px',
			bottom: '100%',
			marginBottom: this.y.cb +'px',
			width: 'auto'
		});
		this.y.p1 = overlay.offsetHeight;
	} else if (/^below$/.test(p)) {
		songajax.setStyles(overlay, {
			position: 'relative',
			left: (- this.x.p1 - this.x.cb) +'px',
			right: (- this.x.p2 - this.x.cb) +'px',
			top: '100%',
			marginTop: this.y.cb +'px',
			width: 'auto'
		});
		this.y.p2 = overlay.offsetHeight;
		overlay.style.position = 'absolute';
	}
},
getOverlays : function() {	
	this.getInline(['heading', 'caption'], true);
	if (this.heading && this.dragByHeading) this.heading.className += ' songajax-move';
	if (songajax.showCredits) this.writeCredits();
	for (var i = 0; i < songajax.overlays.length; i++) {
		var o = songajax.overlays[i], tId = o.thumbnailId, sg = o.slideshowGroup;
		if ((!tId && !sg) || (tId && tId == this.thumbsUserSetId)
				|| (sg && sg === this.slideshowGroup)) {
			if (this.isImage || (this.isHtml && o.useOnHtml))
			this.createOverlay(o);
		}
	}
	var os = [];
	for (var i = 0; i < this.overlays.length; i++) {
		var o = songajax.$('songajaxId'+ this.overlays[i]);
		if (/panel$/.test(o.position)) this.positionOverlay(o);
		else songajax.push(os, o);
	}
	for (var i = 0; i < os.length; i++) this.positionOverlay(os[i]);
	this.gotOverlays = true;
},
genOverlayBox : function() {
	if (!this.overlayBox) this.overlayBox = songajax.createElement (
		'div', {
			className: this.wrapperClassName
		}, {
			position : 'absolute',
			width: (this.x.size || (this.useBox ? this.width : null) 
				|| this.x.full) +'px',
			height: (this.y.size || this.y.full) +'px',
			visibility : 'hidden',
			overflow : 'hidden',
			zIndex : songajax.ie ? 4 : null
		},
		songajax.container,
		true
	);
},
sizeOverlayBox : function(doWrapper, doPanels) {
	var overlayBox = this.overlayBox, 
		x = this.x,
		y = this.y;
	songajax.setStyles( overlayBox, {
		width: x.size +'px', 
		height: y.size +'px'
	});
	if (doWrapper || doPanels) {
		for (var i = 0; i < this.overlays.length; i++) {
			var o = songajax.$('songajaxId'+ this.overlays[i]);
			var ie6 = (songajax.ieLt7 || document.compatMode == 'BackCompat');
			if (o && /^(above|below)$/.test(o.position)) {
				if (ie6) {
					o.style.width = (overlayBox.offsetWidth + 2 * x.cb
						+ x.p1 + x.p2) +'px';
				}
				y[o.position == 'above' ? 'p1' : 'p2'] = o.offsetHeight;
			}
			if (o && ie6 && /^(left|right)panel$/.test(o.position)) {
				o.style.height = (overlayBox.offsetHeight + 2* y.cb) +'px';
			}
		}
	}
	if (doWrapper) {
		songajax.setStyles(this.content, {
			top: y.p1 +'px'
		});
		songajax.setStyles(overlayBox, {
			top: (y.p1 + y.cb) +'px'
		});
	}
},
showOverlays : function() {
	var b = this.overlayBox;
	b.className = '';
	songajax.setStyles(b, {
		top: (this.y.p1 + this.y.cb) +'px',
		left: (this.x.p1 + this.x.cb) +'px',
		overflow : 'visible'
	});
	if (songajax.safari) b.style.visibility = 'visible';
	this.wrapper.appendChild (b);
	for (var i = 0; i < this.overlays.length; i++) {
		var o = songajax.$('songajaxId'+ this.overlays[i]);
		o.style.zIndex = 4;
		if (!o.hideOnMouseOut || this.mouseIsOver) {
			o.style.visibility = 'visible';
			songajax.setStyles(o, { visibility: 'visible', display: '' });
			songajax.animate(o, { opacity: o.opacity }, o.dur);
		}
	}
},
destroyOverlays : function() {
	if (!this.overlays.length) return;
	if (this.isHtml && this.preserveContent) {
		this.overlayBox.style.top = '-9999px';
		songajax.container.appendChild(this.overlayBox);
	} else
	songajax.discardElement(this.overlayBox);
},
createFullExpand : function () {
	this.fullExpandLabel = songajax.createElement(
		'a', {
			href: 'javascript:songajax.expanders['+ this.key +'].doFullExpand();',
			title: songajax.lang.fullExpandTitle,
			className: 'songajax-full-expand'
		}
	);
	this.createOverlay({ 
		overlayId: this.fullExpandLabel, 
		position: songajax.fullExpandPosition, 
		hideOnMouseOut: true, 
		opacity: songajax.fullExpandOpacity
	});
},
doFullExpand : function () {
	try {
		if (this.fullExpandLabel) songajax.discardElement(this.fullExpandLabel);
		this.focus();
		var xSize = this.x.size;
		this.resizeTo(this.x.full, this.y.full);
		var xpos = this.x.pos - (this.x.size - xSize) / 2;
		if (xpos < songajax.marginLeft) xpos = songajax.marginLeft;
		this.moveTo(xpos, this.y.pos);
		this.doShowHide('hidden');
	} catch (e) {
		this.error(e);
	}
},
afterClose : function () {
//	this.a.className = this.a.className.replace('songajax-active-anchor', ''); //打开的窗口还原后显示a标签中的图片
	this.doShowHide('visible');	
	if (this.isHtml && this.preserveContent) {
		this.sleep();
	} else {
		if (this.outline && this.outlineWhileAnimating) this.outline.destroy();
		songajax.discardElement(this.wrapper);
	}
	if (songajax.mask) songajax.mask.style.display = 'none';
	songajax.expanders[this.key] = null;		
	songajax.reOrder();
}
};
// songajax.Ajax object prototype
songajax.Ajax = function (a, content, pre) {
	this.a = a;
	this.content = content;
	this.pre = pre;
};
songajax.Ajax.prototype = {
run : function () {
	if (!this.src) this.src = songajax.getSrc(this.a);
	if (this.src.match('#')) {
		var arr = this.src.split('#');
		this.src = arr[0];
		this.id = arr[1];
	}
	if (songajax.cachedGets[this.src]) {
		this.cachedGet = songajax.cachedGets[this.src];
		if (this.id) this.getElementContent();
		else this.loadHTML();
		return;
	}
	try { this.xmlHttp = new XMLHttpRequest(); }
	catch (e) {
		try { this.xmlHttp = new ActiveXObject("Msxml2.XMLHTTP"); }
		catch (e) {
			try { this.xmlHttp = new ActiveXObject("Microsoft.XMLHTTP"); }
			catch (e) { this.onError(); }
		}
	}
	var pThis = this; 
	this.xmlHttp.onreadystatechange = function() {
		if(pThis.xmlHttp.readyState == 4) {
			if (pThis.id) pThis.getElementContent();
			else pThis.loadHTML();
		}
	};
	var src = this.src;
	if (songajax.forceAjaxReload) 
		src = src.replace(/$/, (/\?/.test(src) ? '&' : '?') +'dummy='+ (new Date()).getTime());
	this.xmlHttp.open('GET', src, true);
	this.xmlHttp.setRequestHeader('X-Requested-With', 'XMLHttpRequest');
	this.xmlHttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	this.xmlHttp.send(null);
},
getElementContent : function() {
	songajax.init();
	var attribs = window.opera || songajax.ie6SSL ? { src: 'about:blank' } : null;
	this.iframe = songajax.createElement('iframe', attribs, 
		{ position: 'absolute', top: '-9999px' }, songajax.container);
	this.loadHTML();
},
loadHTML : function() {
	var s = this.cachedGet || this.xmlHttp.responseText;
	if (this.pre) songajax.cachedGets[this.src] = s;
	if (!songajax.ie || songajax.uaVersion >= 5.5) {
		s = s.replace(/\s/g, ' ').replace(
			new RegExp('<link[^>]*>', 'gi'), '').replace(
			new RegExp('<script[^>]*>.*?</script>', 'gi'), '');
		if (this.iframe) {
			var doc = this.iframe.contentDocument;
			if (!doc && this.iframe.contentWindow) doc = this.iframe.contentWindow.document;
			if (!doc) { // Opera
				var pThis = this;
				setTimeout(function() {	pThis.loadHTML(); }, 25);
				return;
			}
			doc.open();
			doc.write(s);
			doc.close();
			try { s = doc.getElementById(this.id).innerHTML; } catch (e) {
				try { s = this.iframe.document.getElementById(this.id).innerHTML; } catch (e) {} // opera
			}
			songajax.discardElement(this.iframe);
		} else {
			s = s.replace(new RegExp('^.*?<body[^>]*>(.*?)</body>.*?$', 'i'), '$1');
		}
	}
	songajax.getElementByClass(this.content, 'DIV', 'songajax-body').innerHTML = s;
	this.onLoad();
	for (var x in this) this[x] = null;
}
};
if (songajax.ie) {
	(function () {
		try {
			document.documentElement.doScroll('left');
		} catch (e) {
			setTimeout(arguments.callee, 50);
			return;
		}
		songajax.ready();
	})();
}
songajax.addEventListener(document, 'DOMContentLoaded', songajax.ready);
songajax.addEventListener(window, 'load', songajax.ready);
songajax.langDefaults = songajax.lang;
// history
var songajaxExpander = songajax.Expander;
// set songajax
songajax.addEventListener(window, 'load', function() {
	if (songajax.expandCursor) {
		var sel = '.songajax img', 
			dec = 'cursor: url('+ songajax.picsDir + songajax.expandCursor +'), pointer !important;';
		var style = songajax.createElement('style', { type: 'text/css' }, null, 
			document.getElementsByTagName('HEAD')[0]);
		if (!songajax.ie) {
			style.appendChild(document.createTextNode(sel + " {" + dec + "}"));
		} else {
			var last = document.styleSheets[document.styleSheets.length - 1];
			if (typeof(last.addRule) == "object") last.addRule(sel, dec);
		}
	}
});
songajax.addEventListener(window, 'resize', function() {
	songajax.getPageSize();
});
songajax.addEventListener(document, 'mousemove', function(e) {
	songajax.mouse = { x: e.clientX, y: e.clientY	};
});
songajax.addEventListener(document, 'mousedown', songajax.mouseClickHandler);
songajax.addEventListener(document, 'mouseup', songajax.mouseClickHandler);
songajax.addEventListener(document, 'ready', songajax.getAnchors);
songajax.addEventListener(window, 'load', songajax.preloadImages);
songajax.addEventListener(window, 'load', songajax.preloadAjax);
var OfficialAnnoURL = 'http://sum.songcms.com/javascript.php?a=info';