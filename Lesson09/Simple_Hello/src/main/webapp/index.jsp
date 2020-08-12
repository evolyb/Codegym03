<%--
  Created by IntelliJ IDEA.
  User: DELL 7240
  Date: 11/08/2020
  Time: 8:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<style type="text/css">
    .login {
        height:180px; width:230px;
        margin:0;
        padding:10px;
        border:1px #CCC solid;
    }
    .login input {
        padding:5px; margin:5px
    }
</style>
<body>
<form>
    <div class="login">
        <h2>Login</h2>
        <label> Username
            <input type="text" name="username" size="30"  placeholder="username" />
        </label>
        <label> Password
            <input type="password" name="password" size="30" placeholder="password" />
        </label>
        <input type="submit" value="Sign in"/>
    </div>
</form>
</body>
</html>
