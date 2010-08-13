function PMA_markRowsInit() {
	var rows = document.getElementsByTagName('tr');
	for ( var i = 0; i < rows.length; i++ ) {
		if ( navigator.appName == 'Microsoft Internet Explorer' ) {
			rows[i].onmouseover = function() {
				this.className += ' hover';
			}
			rows[i].onmouseout = function() {
				this.className = this.className.replace( ' hover', '' );
			}
		}
		if (rows[i].className.search(/noclick/) != -1) {
			continue;
		}
	}
}
window.onload = PMA_markRowsInit;
