/*
Copyright 2010, KISSY UI Library v1.0.5
MIT Licensed
build: 663 May 19 17:23
*/
(function(f,m,l){if(f[m]===l)f[m]={};m=f[m];var k=f.document,q=function(g,i,r,s){if(!i||!g)return g;if(r===l)r=true;var t,u,w;if(s&&(w=s.length))for(t=0;t<w;t++){u=s[t];if(u in i)if(r||!(u in g))g[u]=i[u]}else for(u in i)if(r||!(u in g))g[u]=i[u];return g},o=false,n=[],p=false;q(m,{version:"1.0.5",_init:function(){this.Env={mods:{}}},add:function(g,i){this.Env.mods[g]={name:g,fn:i};i(this);return this},ready:function(g){p||this._bindReady();o?g.call(f,this):n.push(g);return this},_bindReady:function(){var g=
this,i=k.documentElement.doScroll,r=i?"onreadystatechange":"DOMContentLoaded";p=true;if(k.readyState==="complete")return g._fireReady();if(k.addEventListener){var s=function(){k.removeEventListener(r,s,false);g._fireReady()};k.addEventListener(r,s,false)}else{if(f!=f.top){var t=function(){if(k.readyState==="complete"){k.detachEvent(r,t);g._fireReady()}};k.attachEvent(r,t)}else{var u=function(){try{i("left");g._fireReady()}catch(w){setTimeout(u,1)}};u()}f.attachEvent("onload",function(){g._fireReady()})}},
_fireReady:function(){if(!o){o=true;if(n){for(var g,i=0;g=n[i++];)g.call(f,this);n=null}}},mix:q,merge:function(){var g={},i,r=arguments.length;for(i=0;i<r;++i)q(g,arguments[i]);return g},augment:function(g,i,r,s){q(g.prototype,i.prototype||i,r,s);return g},extend:function(g,i,r,s){if(!i||!g)return g;var t=Object.prototype,u=i.prototype,w=function(b){function c(){}c.prototype=b;return new c}(u);g.prototype=w;w.constructor=g;g.superclass=u;if(i!==Object&&u.constructor===t.constructor)u.constructor=
i;r&&q(w,r);s&&q(g,s);return g},namespace:function(){var g=arguments.length,i=null,r,s,t;for(r=0;r<g;++r){t=(""+arguments[r]).split(".");i=this;for(s=f[t[0]]===i?1:0;s<t.length;++s)i=i[t[s]]=i[t[s]]||{}}return i},app:function(g,i){var r=f[g]||{};q(r,this,true,["_init","add","namespace"]);r._init();return q(f[g]=r,typeof i==="function"?i():i)},log:function(g,i,r){if(this.Config.debug){if(r)g=r+": "+g;if(f.console!==l&&console.log)console[i&&console[i]?i:"log"](g)}return this},error:function(g){if(this.Config.debug)throw g;
}});m._init();m.Config={debug:"@DEBUG@"}})(window,"KISSY");
KISSY.add("kissy-lang",function(f,m){function l(b){var c=typeof b;return b===null||c!=="object"&&c!=="function"}var k=window,q=document,o=location,n=Array.prototype,p=n.indexOf,g=n.filter,i=Object.prototype.toString,r=encodeURIComponent,s=decodeURIComponent,t=/^\s+|\s+$/g,u=/^(\w+)\[\]$/,w=/\S/;f.mix(f,{isBoolean:function(b){return typeof b==="boolean"},isString:function(b){return typeof b==="string"},isNumber:function(b){return typeof b==="number"&&isFinite(b)},isPlainObject:function(b){return b&&
i.call(b)==="[object Object]"&&!b.nodeType&&!b.setInterval},isEmptyObject:function(b){for(var c in b)return false;return true},isFunction:function(b){return typeof b==="function"},isArray:function(b){return i.call(b)==="[object Array]"},trim:String.prototype.trim?function(b){return(b||"").trim()}:function(b){return(b||"").replace(t,"")},each:function(b,c,e){for(var a=b&&b.length||0,d=0;d<a;++d)c.call(e||k,b[d],d,b)},indexOf:p?function(b,c){return p.call(c,b)}:function(b,c){for(var e=0,a=c.length;e<
a;++e)if(c[e]===b)return e;return-1},inArray:function(b,c){return f.indexOf(b,c)!==-1},makeArray:function(b){if(b===null||b===m)return[];if(f.isArray(b))return b;if(typeof b.length!=="number"||typeof b==="string"||f.isFunction(b))return[b];if(b.item&&f.UA.ie){for(var c=[],e=0,a=b.length;e<a;++e)c[e]=b[e];return c}return n.slice.call(b)},filter:g?function(b,c,e){return g.call(b,c,e)}:function(b,c,e){var a=[];f.each(b,function(d,h,j){c.call(e,d,h,j)&&a.push(d)});return a},param:function(b){if(!f.isPlainObject(b))return"";
var c=[],e,a;for(e in b){a=b[e];e=r(e);if(l(a))c.push(e,"=",r(a+""),"&");else if(f.isArray(a)&&a.length)for(var d=0,h=a.length;d<h;++d)l(a[d])&&c.push(e,"[]=",r(a[d]+""),"&")}c.pop();return c.join("")},unparam:function(b,c){if(typeof b!=="string"||(b=f.trim(b)).length===0)return{};var e={};b=b.split(c||"&");for(var a,d,h=0,j=b.length;h<j;++h){a=b[h].split("=");c=s(a[0]);a=s(a[1]||"");if((d=c.match(u))&&d[1]){e[d[1]]=e[d[1]]||[];e[d[1]].push(a)}else e[c]=a}return e},later:function(b,c,e,a,d){c=c||
0;a=a||{};var h=b,j=f.makeArray(d),v;if(typeof b==="string")h=a[b];h||f.error("method undefined");b=function(){h.apply(a,j)};v=e?setInterval(b,c):setTimeout(b,c);return{id:v,interval:e,cancel:function(){this.interval?clearInterval(v):clearTimeout(v)}}},now:function(){return(new Date).getTime()},globalEval:function(b){if(b&&w.test(b)){var c=q.getElementsByTagName("head")[0]||q.documentElement,e=q.createElement("script");e.text=b;c.insertBefore(e,c.firstChild);c.removeChild(e)}}});if(o&&o.search&&o.search.indexOf("ks-debug")!==
-1)f.Config.debug=true});
KISSY.add("kissy-ua",function(f){var m=navigator.userAgent,l,k={webkit:0,chrome:0,safari:0,gecko:0,firefox:0,ie:0,opera:0,mobile:""},q=function(o){var n=0;return parseFloat(o.replace(/\./g,function(){return n++===0?".":""}))};if((l=m.match(/AppleWebKit\/([\d.]*)/))&&l[1]){k.webkit=q(l[1]);if((l=m.match(/Chrome\/([\d.]*)/))&&l[1])k.chrome=q(l[1]);else if((l=m.match(/\/([\d.]*) Safari/))&&l[1])k.safari=q(l[1]);if(/ Mobile\//.test(m))k.mobile="Apple";else if(l=m.match(/NokiaN[^\/]*|Android \d\.\d|webOS\/\d\.\d/))k.mobile=l[0]}else if((l=
m.match(/Opera\/.* Version\/([\d.]*)/))&&l[1]){k.opera=q(l[1]);if(m.match(/Opera Mini[^;]*/))k.mobile=l[0]}else if((l=m.match(/MSIE\s([^;]*)/))&&l[1])k.ie=q(l[1]);else if(l=m.match(/Gecko/)){k.gecko=1;if((l=m.match(/rv:([\d.]*)/))&&l[1])k.gecko=q(l[1]);if((l=m.match(/Firefox\/([\d.]*)/))&&l[1])k.firefox=q(l[1])}f.UA=k});
KISSY.add("selector",function(f,m){function l(b,c,e){var a,d=[],h,j;if(typeof b===r){b=f.trim(b);if(u.test(b)){if(c=q(b.slice(1)))d=[c]}else if(a=w.exec(b)){h=a[1];j=a[2];a=a[3];if(c=h?q(h):k(c))if(a){if(!h||b.indexOf(s)!==-1)d=n(a,j,c)}else if(j)d=o(c,j)}else if(b.indexOf(",")>-1)if(i.querySelectorAll)d=i.querySelectorAll(b);else{h=b.split(",");j=[];d=0;for(b=h.length;d<b;++d)j=j.concat(l(h[d],c));d=p(j)}}else if(b&&b.nodeType)d=[b];else if(b&&b.item)d=b;if(d.item)d=f.makeArray(d);e||g(d);return d}
function k(b){if(b===m)b=i;else if(typeof b===r&&u.test(b))b=q(b.slice(1));else if(b&&b.nodeType!==1&&b.nodeType!==9)b=null;return b}function q(b){return i.getElementById(b)}function o(b,c){return b.getElementsByTagName(c)}function n(b,c,e){e=b=e.getElementsByClassName(b);var a=0,d=0,h=b.length,j;if(c&&c!==t){e=[];for(c=c.toUpperCase();a<h;++a){j=b[a];if(j.tagName===c)e[d++]=j}}return e}function p(b){var c=false;b.sort(function(a,d){a=a.sourceIndex-d.sourceIndex;if(a===0)c=true;return a});if(c)for(var e=
1;e<b.length;e++)b[e]===b[e-1]&&b.splice(e--,1);return b}function g(b){b.each=function(c,e){f.each(b,c,e)}}var i=document,r="string",s=" ",t="*",u=/^#[\w-]+$/,w=/^(?:#([\w-]+))?\s*([\w-]+|\*)?\.?([\w-]+)?$/;(function(){var b=i.createElement("div");b.appendChild(i.createComment(""));if(b.getElementsByTagName(t).length>0)o=function(c,e){c=c.getElementsByTagName(e);if(e===t){e=[];for(var a=0,d=0,h;h=c[a++];)if(h.nodeType===1)e[d++]=h;c=e}return c}})();i.getElementsByClassName||(n=i.querySelectorAll?
function(b,c,e){return e.querySelectorAll((c?c:"")+"."+b)}:function(b,c,e){c=e.getElementsByTagName(c||t);e=[];var a=0,d=0,h=c.length,j,v;for(b=s+b+s;a<h;++a){j=c[a];if((v=j.className)&&(s+v+s).indexOf(b)>-1)e[d++]=j}return e});f.query=l;f.get=function(b,c){return l(b,c,true)[0]||null}});
KISSY.add("dom-base",function(f,m){function l(a,d){return d&&d.nodeName.toUpperCase()===a.toUpperCase()}function k(a,d){for(var h=[],j=0;a;a=a.nextSibling)if(a.nodeType===1&&a!==d)h[j++]=a;return h}function q(a,d,h){d=d||0;for(var j=0;a;a=a[h])if(a.nodeType===1&&j++===d)break;return a}function o(a,d){var h=null,j;if(a&&(a.push||a.item)&&a[0]){d=d||a[0].ownerDocument;h=d.createDocumentFragment();if(a.item)a=f.makeArray(a);d=0;for(j=a.length;d<j;++d)h.appendChild(a[d])}else f.error("unable to convert "+
a+" to fragment");return h}var n=document,p=n.documentElement.textContent!==m?"textContent":"innerText",g=f.UA,i=g.ie,r=i&&i<8,s={readonly:"readOnly"},t=/href|src|style/,u=/href|src|colspan|rowspan/,w=/\r/g,b=/radio|checkbox/,c=n.createElement("DIV"),e=/^[a-z]+$/i;r&&f.mix(s,{"for":"htmlFor","class":"className"});f.DOM={query:f.query,get:f.get,attr:function(a,d,h){if(!a||a.nodeType!==1)return m;var j;d=d.toLowerCase();d=s[d]||d;if(h===m){if(t.test(d)){if(d==="style")j=a.style.cssText}else j=a[d];
if(j===m)j=a.getAttribute(d);if(r&&u.test(d))j=a.getAttribute(d,2);return j===null?m:j}if(d==="style")a.style.cssText=h;else a.setAttribute(d,""+h)},removeAttr:function(a,d){a&&a.nodeType===1&&a.removeAttribute(d)},val:function(a,d){if(!a||a.nodeType!==1)return m;if(d===m){if(l("option",a))return(a.attributes.value||{}).specified?a.value:a.text;if(l("select",a)){d=a.selectedIndex;var h=a.options;if(d<0)return null;else if(a.type==="select-one")return f.DOM.val(h[d]);a=[];d=0;for(var j=h.length;d<
j;++d)h[d].selected&&a.push(f.DOM.val(h[d]));return a}if(g.webkit&&b.test(a.type))return a.getAttribute("value")===null?"on":a.value;return(a.value||"").replace(w,"")}if(l("select",a)){h=f.makeArray(d);var v=a.options,x;d=0;for(j=v.length;d<j;++d){x=v[d];x.selected=f.inArray(f.DOM.val(x),h)}if(!h.length)a.selectedIndex=-1}else a.value=d},css:function(a,d,h){if(h===m)return a.style[d];f.each(f.makeArray(a),function(j){j.style[d]=h})},text:function(a,d){if(d===m)return(a||{})[p]||"";if(a)a[p]=d},html:function(a,
d){if(d===m)return a.innerHTML;a.innerHTML=d},children:function(a){if(a.children)return f.makeArray(a.children);return k(a.firstChild)},siblings:function(a){return k(a.parentNode.firstChild,a)},next:function(a){return q(a,1,"nextSibling")},prev:function(a){return q(a,1,"previousSibling")},parent:function(a){return(a=a.parentNode)&&a.nodeType!==11?a:null},create:function(a,d){if(typeof a==="string")a=f.trim(a);if(e.test(a))return(d||n).createElement(a);var h=null;h=d?d.createElement("DIV"):c;h.innerHTML=
a;a=h.childNodes;return h=a.length===1?a[0].parentNode.removeChild(a[0]):o(a,d||n)},addStyleSheet:function(a,d){var h=n.getElementsByTagName("head")[0],j=n.createElement("style");d&&(j.id=d);h.appendChild(j);if(j.styleSheet)j.styleSheet.cssText=a;else j.appendChild(n.createTextNode(a))}}});
KISSY.add("dom-class",function(f,m){function l(p,g,i){if(f.isArray(p)){f.each(p,function(){g.apply(i,Array.prototype.slice.call(arguments,3))});return true}}var k=f.DOM;f.mix(k,{hasClass:function(p,g){if(!g||!p||!p.className)return false;return(" "+p.className+" ").indexOf(" "+g+" ")>-1},addClass:function(p,g){if(!l(p,o,k,g))if(g&&p)q(p,g)||(p.className+=" "+g)},removeClass:function(p,g){if(!l(p,n,k,g))if(q(p,g)){p.className=(" "+p.className+" ").replace(" "+g+" "," ");q(p,g)&&n(p,g)}},replaceClass:function(p,
g,i){n(p,g);o(p,i)},toggleClass:function(p,g,i){l(p,k.toggleClass,k,g,i)||((i!==m?i:!q(p,g))?o(p,g):n(p,g))}});var q=k.hasClass,o=k.addClass,n=k.removeClass});
KISSY.add("event",function(f,m){function l(c,e,a,d){if(f.isString(e))e=f.query(e);if(f.isArray(e)){f.each(e,function(h){b[c](h,a,d)});return true}if((a=f.trim(a))&&a.indexOf(t)>0){f.each(a.split(t),function(h){b[c](e,h,d)});return true}}function k(c){var e=-1;if(c.nodeType===3||c.nodeType===8)return e;return e=c.nodeType?n.attr(c,s):c.isCustomEventTarget?c.eventTargetId:c[s]}function q(c,e){if(c.nodeType===3||c.nodeType===8)return f.error("Text or comment node is not valid event target.");if(c.nodeType)n.attr(c,
s,e);else if(c.isCustomEventTarget)c.eventTargetId=e;else try{c[s]=e}catch(a){f.error(a)}}function o(c){if(c.nodeType)n.removeAttr(c,s);else if(c.isCustomEventTarget)c.eventTargetId=m;else c[s]=m}var n=f.DOM,p=window,g=document,i=g.addEventListener?function(c,e,a){c.addEventListener&&c.addEventListener(e,a,false)}:function(c,e,a){c.attachEvent&&c.attachEvent("on"+e,a)},r=g.removeEventListener?function(c,e,a){c.removeEventListener&&c.removeEventListener(e,a,false)}:function(c,e,a){c.detachEvent&&c.detachEvent("on"+
e,a)},s="data-ks-event-guid",t=" ",u=f.now(),w={},b={special:{},add:function(c,e,a){if(!l("add",c,e,a)){var d=k(c),h,j;if(!(d===-1||!e||!f.isFunction(a))){if(!d){q(c,d=u++);w[d]={target:c,events:{}}}j=w[d].events;h=!c.isCustomEventTarget&&b.special[e]||{};if(!j[e]){d=function(v,x){if(!v||!v.fixed){v=new f.EventObject(c,v,e);f.isPlainObject(x)&&f.mix(v,x)}h.setup&&h.setup(v);return(h.handle||b._handle)(c,v,j[e].listeners)};j[e]={handle:d,listeners:[]};if(c.isCustomEventTarget)c._addEvent&&c._addEvent(e,
d);else i(c,h.fix||e,d)}j[e].listeners.push(a)}}},remove:function(c,e,a){if(!l("remove",c,e,a)){var d=k(c),h,j,v,x,y,z;if(d!==-1)if(d&&(h=w[d]))if(h.target===c){h=h.events||{};if(j=h[e]){v=j.listeners;y=v.length;if(f.isFunction(a)&&y&&f.inArray(a,v)){z=[];for(x=0;x<y;++x)a!==v[x]&&z.push(v[x]);y=z.length}if(a===m||y===0){c.isCustomEventTarget||r(c,e,j.handle);delete w[d].type}}if(e===m||f.isEmptyObject(h)){for(e in h)b.remove(c,e);delete w[d];o(c)}}}},_handle:function(c,e,a){for(var d,h=0,j=a.length;h<
j;++h){d=a[h].call(c,e);if(e.isImmediatePropagationStopped)break;d===false&&e.halt()}return d},_getCache:function(c){return w[c]},_simpleAdd:i,_simpleRemove:r};b.on=b.add;f.Event=b;p.attachEvent&&!p.addEventListener&&p.attachEvent("onunload",function(){var c,e;for(c in w)if(e=w[c].target)try{b.remove(e)}catch(a){}})});
KISSY.add("event-object",function(f,m){function l(o,n,p){this.currentTarget=o;this.originalEvent=n||{};if(n){this.type=n.type;this._fix()}else{this.type=p;this.target=o}this.fixed=true}var k=document,q="altKey attrChange attrName bubbles button cancelable charCode clientX clientY ctrlKey currentTarget data detail eventPhase fromElement handler keyCode layerX layerY metaKey newValue offsetX offsetY originalTarget pageX pageY prevValue relatedNode relatedTarget screenX screenY shiftKey srcElement target toElement view wheelDelta which".split(" ");
f.mix(l.prototype,{_fix:function(){for(var o=this.originalEvent,n=q.length,p;n;){p=q[--n];this[p]=o[p]}if(!this.target)this.target=this.srcElement||k;if(this.target.nodeType===3)this.target=this.target.parentNode;if(!this.relatedTarget&&this.fromElement)this.relatedTarget=this.fromElement===this.target?this.toElement:this.fromElement;if(this.pageX===m&&this.clientX!==m){o=k.documentElement;n=k.body;this.pageX=this.clientX+(o&&o.scrollLeft||n&&n.scrollLeft||0)-(o&&o.clientLeft||n&&n.clientLeft||0);
this.pageY=this.clientY+(o&&o.scrollTop||n&&n.scrollTop||0)-(o&&o.clientTop||n&&n.clientTop||0)}if(this.which===m)this.which=this.charCode!==m?this.charCode:this.keyCode;if(this.metaKey===m)this.metaKey=this.ctrlKey;if(!this.which&&this.button!==m)this.which=this.button&1?1:this.button&2?3:this.button&4?2:0},preventDefault:function(){var o=this.originalEvent;if(o.preventDefault)o.preventDefault();else o.returnValue=false;this.isDefaultPrevented=true},stopPropagation:function(){var o=this.originalEvent;
if(o.stopPropagation)o.stopPropagation();else o.cancelBubble=true;this.isPropagationStopped=true},stopImmediatePropagation:function(){var o=this.originalEvent;o.stopImmediatePropagation?o.stopImmediatePropagation():this.stopPropagation();this.isImmediatePropagationStopped=true},halt:function(o){o?this.stopImmediatePropagation():this.stopPropagation();this.preventDefault()}});f.EventObject=l});
KISSY.add("event-target",function(f,m){var l=f.Event;f.EventTarget={eventTargetId:m,isCustomEventTarget:true,fire:function(k,q){if((k=((l._getCache(this.eventTargetId||-1)||{}).events||{})[k])&&f.isFunction(k.handle))return k.handle(m,q)},on:function(k,q){l.add(this,k,q)},detach:function(k,q){l.remove(this,k,q)}}});
KISSY.add("event-mouseenter",function(f){var m=f.Event;f.UA.ie||f.each([{name:"mouseenter",fix:"mouseover"},{name:"mouseleave",fix:"mouseout"}],function(l){m.special[l.name]={fix:l.fix,setup:function(k){k.type=l.name},handle:function(k,q,o){var n=q.relatedTarget;try{for(;n&&n!==k;)n=n.parentNode;n!==k&&m._handle(k,q,o)}catch(p){}}}})});
