<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<!DOCTYPE HTML>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base id="base" href="${rc.contextPath}">
<title>MYOA我的办公自动化</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<!--BEGIN GLOBAL MANDATORY STYLES-->
<!--<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" " />-->
<link
	href="${rc.contextPath}/assets/global/plugins/font-awesome/css/font-awesome.css"
	rel="stylesheet" type="text/css" />
<link
	href="${rc.contextPath}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css"
	rel="stylesheet" type="text/css" />
<link href="${rc.contextPath}/assets/global/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="${rc.contextPath}/assets/global/plugins/uniform/css/uniform.default.css"
	rel="stylesheet" type="text/css" />
<link
	href="${rc.contextPath}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"
	rel="stylesheet" type="text/css" />
<!--END GLOBAL MANDATORY STYLES-->
<!-- BEGIN PAGE LEVEL PLUGIN STYLES -->
<link href="${rc.contextPath}/assets/global/plugins/gritter/css/jquery.gritter.css"
	rel="stylesheet" type="text/css" />
<link
	href="${rc.contextPath}/assets/global/plugins/bootstrap-daterangepicker/daterangepicker-bs3.css"
	rel="stylesheet" type="text/css" />
<link href="${rc.contextPath}/assets/global/plugins/fullcalendar/fullcalendar.css"
	rel="stylesheet" type="text/css" />
<link href="${rc.contextPath}/assets/global/plugins/jqvmap/jqvmap/jqvmap.css"
	rel="stylesheet" type="text/css" />
<!-- END PAGE LEVEL PLUGIN STYLES -->
<!-- BEGIN PAGE STYLES -->
<link href="${rc.contextPath}/assets/admin/pages/css/tasks.css" rel="stylesheet"
	type="text/css" />
<!-- END PAGE STYLES -->
<!-- BEGIN THEME STYLES -->
<link href="${rc.contextPath}/assets/global/css/components.css" rel="stylesheet"
	type="text/css" />
<link href="${rc.contextPath}/assets/global/css/plugins.css" rel="stylesheet"
	type="text/css" />
<link href="${rc.contextPath}/assets/admin/layout/css/layout.css" rel="stylesheet"
	type="text/css" />
<link href="${rc.contextPath}/assets/admin/layout/css/themes/darkblue.css"
	rel="stylesheet" type="text/css" id="style_color" />
<link href="${rc.contextPath}/assets/admin/layout/css/custom.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico" />
</head>

<body
	class="page-header-fixed page-quick-sidebar-over-content page-style-square">
	<!-- HEADER 顶部 -->
	<%@ include file="/WEB-INF/decorators/header.jsp"%>
	<div class="clearfix"></div>
	<!--container 整体容器页-->
	<%@ include file="/WEB-INF/decorators/container.jsp"%>
	<!--footer 底部页-->
	<%@ include file="/WEB-INF/decorators/foot.jsp"%>
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<!-- BEGIN CORE PLUGINS -->
	<!--[if lt IE 9]>
<script src="${rc.contextPath}/assets/global/plugins/respond.min.js"></script>
<script src="${rc.contextPath}/assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->
	<script src="${rc.contextPath}/assets/global/plugins/jquery.min.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/global/plugins/jquery-migrate.min.js"
		type="text/javascript"></script>
	<!-- IMPORTANT! Load jquery-ui-1.10.3.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
	<script
		src="${rc.contextPath}/assets/global/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/global/plugins/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/global/plugins/jquery.blockui.min.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/global/plugins/jquery.cokie.min.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/global/plugins/uniform/jquery.uniform.min.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
		type="text/javascript"></script>
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script src="${rc.contextPath}/assets/global/plugins/jqvmap/jqvmap/jquery.vmap.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.russia.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.world.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.europe.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.germany.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.usa.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/jqvmap/jqvmap/data/jquery.vmap.sampledata.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/global/plugins/flot/jquery.flot.min.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/flot/jquery.flot.resize.min.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/flot/jquery.flot.categories.min.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/global/plugins/jquery.pulsate.min.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/bootstrap-daterangepicker/moment.min.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.js"
		type="text/javascript"></script>
	<!-- IMPORTANT! fullcalendar depends on jquery-ui-1.10.3.custom.min.js for drag & drop support -->
	<script
		src="${rc.contextPath}/assets/global/plugins/fullcalendar/fullcalendar.min.js"
		type="text/javascript"></script>
	<script
		src="${rc.contextPath}/assets/global/plugins/jquery-easypiechart/jquery.easypiechart.min.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/global/plugins/jquery.sparkline.min.js"
		type="text/javascript"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="${rc.contextPath}/assets/global/scripts/metronic.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/admin/layout/scripts/layout.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/admin/layout/scripts/quick-sidebar.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/admin/layout/scripts/demo.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/admin/pages/scripts/index.js"
		type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/admin/pages/scripts/tasks.js"
		type="text/javascript"></script>
	<!-- END PAGE LEVEL SCRIPTS -->
	<script>
		jQuery(document).ready(
				function() {
					if (localStorage.click != null) {
						$(".sub-menu").css("display", "none");
						$(".sub-menu>li").removeClass("active");
						$($(".sub-menu>li")[localStorage.click]).addClass(
								"active").parent().css("display", "block");
					}
					$(".sub-menu>li").on("click", function() {
						localStorage.click = $(".sub-menu>li").index($(this));
					});
					Metronic.init(); // init metronic core componets
					Layout.init(); // init layout
					QuickSidebar.init(); // init quick sidebar
					Theme.init(); // init demo features 
				});
	</script>
	<decorator:head />
	<!-- END JAVASCRIPTS -->
</body>
</html>