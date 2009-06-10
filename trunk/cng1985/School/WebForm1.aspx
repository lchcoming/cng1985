<%@ Page Language="C#" MasterPageFile="~/Design/Site.Master" AutoEventWireup="true"
    CodeBehind="WebForm1.aspx.cs" Inherits="School.WebForm1" Title="无标题页" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <div id="body">
        <div id="left">
            <div class="feat_prod_box">
                <div class="prod_img">
                    <a href="details.html">
                        <img src="../images/prod1.gif" alt="" title="" border="0" /></a></div>
                <div class="prod_det_box">
                    <div class="box_top">
                    </div>
                    <div class="box_center">
                        <div class="prod_title">
                            Product name</div>
                        <p class="details">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                            incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
                            exercitation.</p>
                        <a href="details.html" class="more">- more details -</a>
                        <div class="clear">
                        </div>
                    </div>
                    <div class="box_bottom">
                    </div>
                </div>
                <div class="clear">
                </div>
            </div>
        </div>
        <div id="right">
        </div>
    </div>
</asp:Content>
