<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>jeeny的博客</title>
	<meta http-equiv="Content-Language" content="English" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="author" content="David Herreman (www.free-css-templates.com)" />
	<meta name="description" content="Free Css Template" />
	<meta name="keywords" content="free,css,template" />	
	<meta name="Robots" content="index,follow" />
	<meta name="Generator" content="sNews 1.5" />
	<link rel="stylesheet" type="text/css" href="/css/style.css" media="screen" />
	<link rel="alternate" type="application/rss+xml" title="RSS 2.0" href="rss/" />
	<link rel="stylesheet" href="/css/reset-grids-min.css" />
<script src="/js/yahoo-dom-event.js"></script>
<script src="/js/kissy-core-min.js"></script>

<script src="/js/suggest-min.js"></script>

<style>
    #page { padding: 50px 50px 300px; width: 750px; margin: 0 auto; }
    h1, h2, h3 { margin: 1em 0 0.3em; }
    .section { margin-bottom: 50px; }
    .section ol { margin: 5px 20px; }
    .section ol li { list-style: decimal inside; margin: 5px 0; }
    .search-input { width: 300px; height: 20px; padding: 3px 2px 2px 4px; }
    .search-submit { padding: 4px 10px; margin-left: 5px; }
    input.g-submit { padding: 2px 8px; margin-left: 5px; }
    html { overflow-y: scroll; }
</style>
</head>

<body>
		
<div id="topbar">
		<div class="content">
			
			<div class="wrap content">

				<form action="/search.htm" method="post">
<div class="se">
				<input class="text" style="width:150px;" id="searchid" name="search" type="text" value="Search..."  onblur="if(this.value=='') this.value='Search...';" onfocus="if(this.value=='Search...') this.value='';" />
			 <script>
			 KISSY.ready(function(S) {
	                // Google
	                var dataUrl = 'http://clients1.google.com/complete/search';
	                window.google = {};
	                window.google.ac = {};
	                window.google.ac.h = window["g_ks_suggest_callback"];

	                var sug = new S.Suggest('#searchid', dataUrl,
	                {
	                    resultFormat: '',
	                    containerCls: 'g-sug',
	                    submitFormOnClickSelect: false
	                });

	                sug.on('dataRequest', function() {
	                    this.dataScript.charset = 'utf-8';
	                    this.queryParams = 'hl=en&q=' + encodeURIComponent(this.query);
	                });

	                // google: window.google.ac.h(["ni",[["牛博网","73,248 结果","0z"],["牛博网首页","12,200,617 结果","1z"],["你是准备替党说话 还是准备替老百姓说话","136,545 结果","2z"],["nike","117,000,000 结果","3"],["nikon","127,000,000 结果","4"],["nissan","135,000,000 结果","5"],["nine west","40,000,000 结果","6"],["nike鞋","3,380,000 结果","7"],["倪萍 再婚","36,400 结果","8"],["牛年祝福语","582,000 结果","9"]]])
	                // taobao: g_ks_suggest_callback({"result": [["nike 正品", "2170000"], ["nike 专柜 正品", "834000"], ["nike 短袖", "242000"], ["nike 板 鞋", "989000"], ["nike 女鞋", "253000"], ["nike 运动鞋", "550000"], ["nike 包", "295000"], ["nike 鞋", "3160000"], ["nike 单肩包", "38500"], ["nike 09", "786000"]]})
	                sug.on('dataReturn', function() {
	                    this.returnedData = this.returnedData[1] || [];
	                });
	            });
        </script>
			</div>					
				</form>

				<h1><a href="#" title="">jeeny的博客</a></h1>
			</div>
		</div>
</div>

<div id="subbar">
	<div class="content">
		<div class="wrap menu">
				<div class="right rss">
					<a href="/rss/" title=""><img src="images/rss.gif" alt="RSS" /></a>
				</div>
				<ul>	
					<li><a class="current" href="http://www.free-css-templates.com" title="home"><span>Home</span></a></li>
					<li><a href="#" title="Gallery">Gallery</a></li>
					<li><a href="#" title="Affiliates">Download</a></li>
					<li><a href="#" title="Articles">Community</a></li>
					<li><a href="#" title="Abous us">About</a></li>
					<li><a href="#" title="Contact">Contact</a></li>
				</ul>
		</div>
	</div>
</div>
	
	
<div class="content">
	<div id="main">
		<div class="padding">
			<div class="right_side">
				<div class="sponsors">
					<a href="#" title="sponsor1"><img class="ml" src="images/sponsor.jpg" alt="" /></a>
					<a href="#" title="sponsor2"><img class="ml" src="images/sponsor.jpg" alt="" /></a>
					<a href="#" title="sponsor3"><img src="images/sponsor.jpg" alt="" /></a>
				</div>
				<h3>Latest Articles</h3>
				<ul>
					<li><a href="http://www.free-css-templates.com/webdesign/helpful-links-for-webdesigners/" title="Webdesign : Helpful Links for Webdesigners (December 16 , 2007)">Helpful Links for Webdesigners</a></li>
					<li><a href="http://www.free-css-templates.com/internet-news/xhtml-css-validator/" title="Internet : XHTML and CSS Validator (December 15 , 2007)">XHTML and CSS Validator</a></li>
					<li><a href="http://www.free-css-templates.com/internet-news/free-photoshop-alternatives/" title="Internet : Free Photoshop Alternatives (December 14 , 2007)">Free Photoshop Alternatives</a></li>
					<li><a href="http://www.free-css-templates.com/free-css-templates-site-news/the-stumbleupon-effect/" title="Site News : The StumbleUpon effect (December 13 , 2007)">The StumbleUpon effect</a></li>
					<li><a href="http://www.free-css-templates.com/webdesign/free-psd-icons/" title="Webdesign : Free PSD Icons (December 13 , 2007)">Free PSD Icons</a></li>
					<li><a href="http://www.free-css-templates.com/internet-news/creating-attractive-web-charts-and-graphs/" title="Internet : Creating Attractive Web Charts and Graphs (December 13 , 2007)">Creating Attractive Web Charts and Graphs</a></li>
					<li><a href="http://www.free-css-templates.com/webdesign/20-cool-website-headers/" title="Webdesign : 20 Cool Website Headers (December 12 , 2007)">20 Cool Website Headers</a></li>
				</ul>
				<div class="extra">
					<div class="padding">
						Place your extra content here like ads, news, tags,...
					</div>
				</div>
				<div class="ls">
					<h3>Categories</h3>
					<ul>
						<li><a href="http://www.free-css-templates.com/" title="Home">Home</a></li>
						<li><a href="http://www.free-css-templates.com/free_css_xhtml_templates/" title="Free Css/XHTML Templates for your Websites!">Templates (14)</a></li>
						<li><a href="http://www.free-css-templates.com/webdesign/" title="webdesign">Webdesign (11)</a></li>
						<li><a href="http://www.free-css-templates.com/photoshop-webdesign-tutorials/" title="The best tutorials from internet about the webdesign and photoshop.">Tutorials (21)</a></li>
						<li><a href="http://www.free-css-templates.com/photoshop-stuffs/" title="Photoshop Stuffs">Photoshop (14)</a></li>
						<li><a href="http://www.free-css-templates.com/css-techniques/" title="Css techniques">CSS Techniques (15)</a></li>
						
					</ul>
					<h3>New Comments</h3>
					<ul>
						<li><a href="#" title="">Ok Mike, it's done...)</a></li>
						<li><a href="#" title="">Thanks I got it...</a></li>
						<li><a href="#" title="">Mike: Just make links to...</a></li>
						<li><a href="#" title="">Site referenced on comme...</a></li>
						<li><a href="#" title="">I'm very pleased I found this...</a></li>
					</ul>
     			</div>
				<div class="rs">
					<h3>Links</h3>
					<ul>
						<li><a href="http://www.free-css-templates.com/code2css.php" title="Style your code with CSS">Code2Css</a></li>
						<li><a href="http://www.free-css-templates.com" title="Free Css Templates">Free Css Templates</a></li>
						<li><a href="http://www.free-css-templates.com/website_templates.html" title="Website Templates">Website Templates</a></li>
						<li><a href="http://www.snewscms.com" title="sNews CMS">sNews CMS</a></li>
						<li><a href="http://www.cssheaven.com/" title="Css Gallery CssHeaven">Css Heaven</a></li>
						<li><a href="http://www.csscreme.com/" title="Css Gallery CssCreme">Css Creme</a></li>
						<li><a href="http://www.links4se.com/" title="SEO Directory">Link4se.com</a></li>
					</ul>
					
				</div>
			</div>
		
			<div id="left_side">
				<div class="intro">
					<div class="pad">sNews is a completly free PHP and MySQL driven content management system for managing web content. Consisting of only one file, sNews is extremely lightweight, easy to install, and easy to use via a simple web interface.
						<br /><a href="http://www.snewscms.com" title="sNews cms">Download </a>&nbsp; | &nbsp;<a href="http://www.snewscms.com" title="sNews cms">Read more...</a>
					</div>
				</div>
				<div class="mpart">
				<h2>Webdesign</h2>
				<h3>Posted on April 11 , 2007 in <a href="#" title="">sNews</a></h3>
				<p>A website like <a href="http://www.free-css-templates.com" title="Free Website Templates">free-css-templates.com</a> is a collection of information about a particular topic or subject. Designing a 
					website is defined as the arrangement and creation of web pages that in turn make up a 
					website. A web page consists of information for which the website is developed. 
					A website might be compared to a book, where each page of the book is a web page.
				</p>
				<p>

					Here a code sample made with <a href="http://www.free-css-templates.com/code2css.php" title="Source code styled with CSS">Code2CSS</a>:
				</p>
				<ol class="code">
					<li class="t0">for ($i = 0; $i &lt; $num_kw; $i++) {</li>
					<li class="t2"><code>$keywords = trim($kws[$i]);</code></li>
					<li class="t2"><code>$value .= " keywords_meta LIKE '%$keywords%' ";</code></li>

					<li class="t2"><code>if ($i &lt; $num_kw-1) {</code></li>
					<li class="t3"><code>$value .= " OR ";</code></li>
					<li class="t2"><code>}</code></li>
					<li class="t0">}</li>
				</ol>
				<p>Blockquote example:</p>

					<blockquote>
						<p>The Extensible HyperText Markup Language, or XHTML, is a markup language that has the same depth of expression as HTML, but with a syntax that conform to XML syntax.</p>
					</blockquote>
				<div class="date"><a href="#" title="#">Comments (5)</a></div>
				<h2>Cascading Style Sheets</h2>
				<h3>Posted on April 10 , 2007 in <a href="#" title="">Internet</a></h3>
				<div class="rs">
					<strong>List example</strong>:
					<ul>

						<li>list line 1</li>
						<li>list line 2
							<ul>
								<li>sublist line a</li>
								<li>sublist line b</li>
							</ul>
						</li>
					</ul>

				</div>
				<p>In computing, <b>Cascading Style Sheets</b> (<b>CSS</b>) is a <a href="http://en.wikipedia.org/wiki/Stylesheet_language" title="Stylesheet language">stylesheet language</a> used to describe the presentation of a document written in a <a href="http://en.wikipedia.org/wiki/Markup_language" title="Markup language">markup language</a>. Its most common application is to style <a href="http://en.wikipedia.org/wiki/Web_page" title="Web page">web pages</a> written in <a href="http://en.wikipedia.org/wiki/HTML" title="HTML">HTML</a> and <a href="http://en.wikipedia.org/wiki/XHTML" title="XHTML">XHTML</a>, but the language can be applied to any kind of <a href="http://en.wikipedia.org/wiki/XML" title="XML">XML</a> document, including <a href="http://en.wikipedia.org/wiki/Scalable_Vector_Graphics" title="Scalable Vector Graphics">SVG</a> and <a href="http://en.wikipedia.org/wiki/XUL" title="XUL">XUL</a>. The CSS specifications are maintained by the <a href="http://en.wikipedia.org/wiki/World_Wide_Web_Consortium" title="World Wide Web Consortium">World Wide Web Consortium</a> (W3C).</p>

				<p>CSS has various levels and profiles. Each level of CSS builds upon the last, typically adding new features and are typically denoted as CSS1, CSS2, and CSS3. Profiles are typically a subset of one or more levels of CSS built for a particular device or user interface. Currently there are profiles for mobile devices, printers, and television sets. Profiles should not be confused with media types which were added in CSS2.</p>
				<div class="date"><a href="#" title="#">Comments (11)</a></div>
				</div>
			</div>
		</div>
	<div class="clear"></div>
	</div>
	<div id="footer">
		<div class="right">
			<a href="http://jigsaw.w3.org/css-validator/check/referer" title="Validate">CSS</a> / <a href="http://validator.w3.org/check?uri=referer" title="Validate">XHTML</a>  Valid!
		</div>
		<div class="fmenu">
			<ul>
				<li><a href="http://www.free-css-templates.com" title="home"><span>Home</span></a> | </li>				<li><a href="#" title="Gallery">Gallery</a>| </li>
				<li><a href="#" title="Affiliates">Download</a> | </li>
				<li><a href="#" title="Articles">Community</a> | </li>
				<li><a href="#" title="Abous us">About</a> | </li>
				<li><a href="#" title="Contact">Contact</a></li>
			</ul>
		</div>
	<br />
	&copy; Copyright 2007, Your Website - Design: <a href="http://www.free-css-templates.com" title="Free Css Template">Free Css Templates</a>
	</div>	
	
</div>
</body>
</html>

