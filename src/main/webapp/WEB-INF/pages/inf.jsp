<c:if test="${!empty listUsers}">
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">UserName</th>
        </tr>
        <c:forEach items="${listUsers}" var="user">
            <tr>
                <td>${user.id}</td>
                <td><${user.id}" target="_blank">${user.username}</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
