<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${search}
 <form name="f" action="http://www.google.com/search">
            <table cellspacing="0" cellpadding="0">
                <tbody>
                <tr valign="top">
                    <td width="25%"></td>
                    <td nowrap="" align="center">
                        <input type="hidden" value="en" name="hl"/>
                        <input style="padding: 3px 2px" value="${search}" title="Google Search" size="55" id="gq" name="q" maxlength="2048" autocomplete="off"/>
                        <br/>
                        <input type="submit" class="g-submit" onclick="this.checked=1" value="Google Search" name="btnG"/>
                        <input type="submit" class="g-submit" onclick="this.checked=1" value="I'm Feeling Lucky" name="btnI"/>
                    </td>
                </tr>
                </tbody>
            </table>
            <input type="hidden" name="aq" value="f"/><input type="hidden" name="oq" value="n"/><input type="hidden" name="aqi" value="g10"/>
        </form>
</body>
</html>