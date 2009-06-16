<%@ Page Language="C#" Inherits="System.Web.Mvc.ViewPage<IEnumerable<School.LinqModle.Message>>" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>List</title>
</head>
<body>
    <table>
        <tr>
            <th></th>
            <th>
                ID
            </th>
            <th>
                Title
            </th>
            <th>
                Message1
            </th>
            <th>
                UserID
            </th>
        </tr>

    <% foreach (var item in Model) { %>
    
        <tr>
            <td>
                <%= Html.ActionLink("Edit", "Edit", new { /* id=item.PrimaryKey */ }) %> |
                <%= Html.ActionLink("Details", "Details", new { /* id=item.PrimaryKey */ })%>
            </td>
            <td>
                <%= Html.Encode(item.ID) %>
            </td>
            <td>
                <%= Html.Encode(item.Title) %>
            </td>
            <td>
                <%= Html.Encode(item.Message1) %>
            </td>
            <td>
                <%= Html.Encode(item.UserID) %>
            </td>
        </tr>
    
    <% } %>

    </table>

    <p>
        <%= Html.ActionLink("Create New", "Create") %>
    </p>

</body>
</html>

