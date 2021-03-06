<%--
  Created by IntelliJ IDEA.
  User: minsub
  Date: 2019-06-19
  Time: 오후 5:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:url var="R" value="/" />
<!DOCTYPE HTML>
<html>
<head>
    <title>SKHU VOTE</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <link rel="stylesheet" href="${R}assets/css/main.css" />
    <link rel="stylesheet" href="${R}resources/table.css" />
    <link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/innks/NanumSquareRound/master/nanumsquareround.min.css">
    <link rel="stylesheet" href="//cdn.rawgit.com/hiun/NanumSquare/master/nanumsquare.css">

</head>


<body class="homepage is-preload">
<div id="page-wrapper">

    <!-- Header -->
    <%@include file="/WEB-INF/include/menu.jsp"%>

    <!-- Features -->

    <!-- Banner -->
    <section id="banner">
        <div class="container" >
            <p style="font-family:'Jeju Gothic', serif;">입후보등록 신청 현황</p>
        </div>
    </section>

    <!-- Main -->
    <section id="main">
        <div class="container" style="font-family:'NanumSquareRound',sans-serif;">
            <div class="row">

                <!-- Content -->
                <div id="content" class="col-8 col-12-medium">
                    <!-- Post -->
                    <article class="box post">

                    </article>
                    <div class="container">
                        <ul class="responsive-table">
                            <li class="table-header">

                                <div class="col col-3" style="font-size: 25px"><strong>팀 이름</strong></div>
                                <div class="col col-3" style="font-size: 25px"><strong>정 후보</strong></div>
                                <div class="col col-3" style="font-size: 25px"><strong>부 후보</strong></div>
                                <div class="col col-4" style="font-size: 25px"><strong>승인 상태</strong></div>
                            </li>
                            <li class="table-row">
                                <c:if test="${team !=null}">
                                    <div class="col col-3" data-label="teamName">${team.name}</div>
                                    <div class="col col-3" data-label="candidate1">${team.candidate1idx}</div>
                                    <div class="col col-3" data-label="candidate2">${team.candidate2idx}</div>
                                    <div class="col col-4" data-label="type_chk">
                                        <c:if test="${team.typeChk==0}">
                                            <span style="color: #6610f2"> 대기</span>
                                        </c:if>
                                        <c:if test="${team.typeChk==1}">
                                            <span style="color: #34ce57;">승인</span>
                                        </c:if>
                                        <c:if test="${team.typeChk==2}">
                                            <span style="color: #CD3C3C;">반려</span>
                                        </c:if>
                                    </div>
                                </c:if>
                                <c:if test="${team ==null}">
                                     <span style="margin: auto">후보 신청 내역이 없습니다</span>
                                </c:if>
                            </li>

                        </ul>
                    </div>


                </div>
            </div>
        </div>
    </section>

    <!-- Footer -->
    <%@include file="/WEB-INF/include/footer.jsp"%>
</div>

<!-- Scripts -->
<script src="${R}assets/js/jquery.min.js"></script>
<script src="${R}assets/js/jquery.dropotron.min.js"></script>
<script src="${R}assets/js/browser.min.js"></script>
<script src="${R}assets/js/breakpoints.min.js"></script>
<script src="${R}assets/js/util.js"></script>
<script src="${R}assets/js/main.js"></script>
<style type="text/css">
    @import url(http://fonts.googleapis.com/earlyaccess/hanna.css);
    @import url(http://fonts.googleapis.com/earlyaccess/jejugothic.css);
    body{
        background-color:white;
    }
    p{
        font-family:'Jeju Gothic', serif;
    }
    body{
        font-family:'NanumSquareRound',sans-serif;
    }
</style>
</body>
</html>