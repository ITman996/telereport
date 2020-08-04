<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <%@ include file="../common/head.jsp" %>
</head>
<body>
<!--导航条开始-->
<%@ include file="../common/nav.jsp" %>
<!--导航条结束-->

<!--布局容器开始-->
<div class="container-fluid">
    <div class="row">
        <!--菜单开始-->
        <%@ include file="../common/menu.jsp" %>
        <!--菜单结束-->
        <!--出帐收入首页开始-->
        <div class="col-md-9">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">网间结算查询</h3>
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" action="${pageContext.request.contextPath}/wangjianjiesuan/list" method="post">
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">城市编码</label>
                            <div class="col-sm-4">
                                <select name="cityCode" id="cityCode" class="form-control">
                                    <option value="">请选择...</option>
                                    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
                                    <c:forEach items="${cityList}" var="city">
                                        <option value="${city.cityCode}">${city.cityCode}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <label for="inputPassword3" class="col-sm-1 control-label">产品编码</label>
                            <div class="col-sm-4">
                                <select name="productCode" id="productCode" class="form-control">
                                    <option value="">请选择...</option>
                                    <!--导入核心标签库 item:控制层的属性名；>:显示-->
                                    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
                                    <c:forEach items="${productList}" var="product">
                                        <option value="${product.productCode}">${product.productCode}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">结算运营商编码</label>
                            <div class="col-sm-4">
                                <select name="spCode" id="spCode" class="form-control">
                                    <option value="">请选择...</option>
                                    <!--导入核心标签库 item:控制层的属性名；>:显示-->
                                    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
                                    <c:forEach items="${spCodeList}" var="spCode">
                                        <option value="${spCode.balanceSpCode}">${spCode.balanceSpCode}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <label for="inputEmail3" class="col-sm-1 control-label">结算类型编码</label>
                            <div class="col-sm-4">
                                <select name="typeCode" id="typeCode" class="form-control">
                                    <option value="">请选择...</option>
                                    <!--导入核心标签库 item:控制层的属性名；>:显示-->
                                    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
                                    <c:forEach items="${typeCodeList}" var="typeCode">
                                        <option value="${typeCode.balanceTypeCode}">${typeCode.balanceTypeCode}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">结算金额</label>
                            <div class="col-sm-4">
                                <input  type="text" class="form-control">
                            </div>
                            <label for="inputPassword3" class="col-sm-1 control-label">结算月份</label>
                            <div class="col-sm-4">
                                <input type="date" class="form-control">
                            </div>
                            </div>

                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default">查询</button>&nbsp;&nbsp;
                                <a href="#" class="btn btn-default" role="button">录入</a>&nbsp;&nbsp;
                                <a href="#" class="btn btn-default" role="button">导出</a>&nbsp;&nbsp;
                                <a href="#" class="btn btn-default" role="button">导入</a>&nbsp;&nbsp;
                                <a href="#" class="btn btn-default" role="button">批量删除</a>
                            </div>
                        </div>
                    </form>


                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">查询结果</h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal">
                                <table class="table table-bordered table-hover table-striped">
                                    <tr>
                                        <th><input type="checkbox"></th>
                                        <th>序号</th>
                                        <th>城市</th>
                                        <th>产品</th>
                                        <th>结算运营商</th>
                                        <th>结算类型</th>
                                        <th>结算金额</th>
                                        <th>结算月份</th>
                                        <th style="colspan: 4">操作</th>
                                    </tr>
                                    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
                                    <c:forEach items="${rpNetBalanceRecordList}" var="rpNetBalanceRecord">
                                        <tr>
                                            <td><input type="checkbox"></td>
                                            <td>${rpNetBalanceRecord.id}</td>
                                            <td>${rpNetBalanceRecord.cityCode}</td>
                                            <td>${rpNetBalanceRecord.productCode}</td>
                                            <td>${rpNetBalanceRecord.balanceSpCode}</td>
                                            <td>${rpNetBalanceRecord.balanceTypeCode}</td>
                                            <td>${rpNetBalanceRecord.balanceFee}</td>
                                            <td><fmt:formatDate pattern="yyyy-MM-dd"
                                                                value="${rpNetBalanceRecord.balanceMonth}" /></td>
                                            <td><a href="#">编辑</a></td>
                                            <td><a href="#">删除</a></td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--出账收入首页结束-->
    </div>
</div>
<!--布局容器结束-->
<%@ include file="../common/foot.jsp" %>
</body>
</html>