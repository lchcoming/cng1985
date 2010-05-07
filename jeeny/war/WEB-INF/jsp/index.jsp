<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="gbk" />
<title>Suggest Examples</title>

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
<div id="page">
    <div class="section">
        <h2>1. 淘宝首页的搜索提示：</h2>
        <form name="search" method="get" action="http://search1.taobao.com/browse/search_auction.htm">
            <input type="hidden" value="" name="sort"/>
            <input type="hidden" value="D9_5_1" name="f"/>
            <input type="hidden" value="" name="promote"/>
            <input type="hidden" value="2" name="isnew"/>
            <input type="hidden" value="b" name="atype"/>
            <input type="hidden" value="all" name="commend"/>
            <input type="hidden" value="auction" name="search_type"/>
            <input type="hidden" value="initiative" name="user_action"/>
            <input type="hidden" value="s1-e" name="ssid"/>

            <input name="q" id="q" class="search-input"/>

            <button type="submit" class="search-submit">淘我喜欢</button>
        </form>
        <script>
            KISSY.ready(function(S) {
                S.Suggest('#q', 'http://suggest.taobao.com/sug', {
                    autoFocus: false,
					submitFormOnClickSelect:false,
                    resultFormat: '约%result%个宝贝'
                });
            });
        </script>
    </div>

    <div class="section">
        <h2>2. 有啊首页的搜索提示：</h2>
        <form name="search2" method="get" action="http://youa.baidu.com/search/s" target="_blank">
            <input class="search-input" name="keyword" id="q2" />
            <button type="submit" class="search-submit">百度一下</button>
        </form>
        <style>
            .youa-suggest-container { border-color: #5BA515 }
            .youa-suggest-container li { padding: 2px 0 3px; font-size: 14px; line-height: 20px }
            .youa-suggest-container li.selected { background-color: #DEEFC5 }
            .youa-suggest-container .suggest-result { font-size: 12px; color: #999 }
            .youa-suggest-container li.selected span { color: #240055 }
            .youa-suggest-container li.selected .suggest-result { color: #999 }
        </style>
        <script>
            KISSY.ready(function(S) {
                // 有啊
                var dataUrl = 'http://youa.baidu.com/suggest/se/s';
                window["suggestCallback"] = window["g_ks_suggest_callback"];

                var sug = new S.Suggest('#q2', dataUrl, {
                    containerCls: 'youa-suggest-container',
                    submitFormOnClickSelect:false
                });

                sug.on('dataRequest', function() {
                    this.dataScript.charset = 'GB18030';
                    this.queryParams = 'cmd=suggest&type=kwd&max_count=10&keyword=' + encodeURIComponent(this.query) + '&callback=suggestCallback';
                });

                // youa: suggestCallback({"err":"ok", "r":[{"key":"nike", "val":140000}, {"key":"nike鞋", "val":119000}, {"key":"nike板鞋", "val":44300}, {"key":"nike运动鞋", "val":115000}, {"key":"nike正品", "val":47400}, {"key":"nike包", "val":8300}, {"key":"nike篮球鞋", "val":18400}, {"key":"nike新款", "val":27600}, {"key":"nike 耐克", "val":140000}, {"key":"nike女鞋", "val":7850}], "num":10})
                // taobao: g_ks_suggest_callback({"result": [["nike 正品", "2170000"], ["nike 专柜 正品", "834000"], ["nike 短袖", "242000"], ["nike 板 鞋", "989000"], ["nike 女鞋", "253000"], ["nike 运动鞋", "550000"], ["nike 包", "295000"], ["nike 鞋", "3160000"], ["nike 单肩包", "38500"], ["nike 09", "786000"]]})
                sug.on('dataReturn', function() {
                    var data = this.returnedData['r'] || [];
                    var result = [];

                    for (var i = 0, len = data.length; i < len; ++i) {
                        result.push([data[i]['key'], data[i]['val']]);
                    }

                    this.returnedData = result;
                });
            });
        </script>
    </div>

    <div class="section" style="width: 380px">
        <h2>3. Google Search</h2>
        <form name="f" action="http://www.google.com/search">
            <table cellspacing="0" cellpadding="0">
                <tbody>
                <tr valign="top">
                    <td width="25%"></td>
                    <td nowrap="" align="center">
                        <input type="hidden" value="en" name="hl"/>
                        <input style="padding: 3px 2px" value="" title="Google Search" size="55" id="gq" name="q" maxlength="2048" autocomplete="off"/>
                        <br/>
                        <input type="submit" class="g-submit" onclick="this.checked=1" value="Google Search" name="btnG"/>
                        <input type="submit" class="g-submit" onclick="this.checked=1" value="I'm Feeling Lucky" name="btnI"/>
                    </td>
                </tr>
                </tbody>
            </table>
            <input type="hidden" name="aq" value="f"/><input type="hidden" name="oq" value="n"/><input type="hidden" name="aqi" value="g10"/>
        </form>
        <style>
            .g-sug { border-color: #666 }
            .g-sug li { padding: 2px 0 3px }
            .g-sug li.selected { background-color: #D5E2FF }
            .g-sug li.selected span { color: #240055 }
        </style>
        <script>
            KISSY.ready(function(S) {
                // Google
                var dataUrl = 'http://clients1.google.com/complete/search';
                window.google = {};
                window.google.ac = {};
                window.google.ac.h = window["g_ks_suggest_callback"];

                var sug = new S.Suggest('#gq', dataUrl,
                {
                    resultFormat: '',
                    submitFormOnClickSelect:false,
                    containerCls: 'g-sug'
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

</div>
</body>
</html>
