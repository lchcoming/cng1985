<%@ Page Language="C#" Inherits="System.Web.Mvc.ViewPage<School.LinqModle.Message>" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>Details</title>
</head>
<body>
    <fieldset>
        <legend>Fields</legend>
        <p>
            ID:
            <%= Html.Encode(Model.ID) %>
        </p>
        <p>
            Title:
            <%= Html.Encode(Model.Title) %>
        </p>
        <p>
            Message1:
            <%= Html.Encode(Model.Message1) %>
        </p>
        <p>
            UserID:
            <%= Html.Encode(Model.UserID) %>
        </p>
    </fieldset>
    <p>
        <%=Html.ActionLink("Edit", "Edit", new { id=Model.ID }) %> |
        <%=Html.ActionLink("Back to List", "Index") %>
    </p>

</body>
</html>

