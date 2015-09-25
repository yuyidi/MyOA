<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- BEGIN SIDEBAR -->
<div class="page-sidebar-wrapper">
	<div class="page-sidebar navbar-collapse collapse">
		<!-- BEGIN SIDEBAR MENU -->
		<!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
		<!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
		<!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
		<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
		<!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
		<!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
		<ul class="page-sidebar-menu" data-keep-expanded="false"
			data-auto-scroll="false" data-slide-speed="200">
			<!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below "sidebar-toggler-wrapper" LI element -->
			<li class="sidebar-toggler-wrapper">
				<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
				<div class="sidebar-toggler"></div> <!-- END SIDEBAR TOGGLER BUTTON -->
			</li>
			<!-- DOC: To remove the search box from the sidebar you just need to completely remove the below "sidebar-search-wrapper" LI element -->
			<li class="sidebar-search-wrapper">
				<!-- BEGIN RESPONSIVE QUICK SEARCH FORM --> <!-- DOC: Apply "sidebar-search-bordered" class the below search form to have bordered search box -->
				<!-- DOC: Apply "sidebar-search-bordered sidebar-search-solid" class the below search form to have bordered & solid search box -->
				<form class="sidebar-search " action="extra_search.html"
					method="POST">
					<a href="javascript:;" class="remove"> <i class="icon-close"></i>
					</a>
					<div class="input-group">
						<input type="text" class="form-control" placeholder="Search...">
						<span class="input-group-btn"> <a href="javascript:;"
							class="btn submit"><i class="icon-magnifier"></i></a>
						</span>
					</div>
				</form> <!-- END RESPONSIVE QUICK SEARCH FORM -->
			</li>
			<c:forEach items="${sysfun}" var="sysfun" varStatus="status">
				<c:choose>
					<c:when test="${status.first}">
						<li class="start active open">
					</c:when>
					<c:otherwise>
						<li class="start  open">
					</c:otherwise>
				</c:choose>
				<a href="javascript:;"> <i class="${sysfun.icon}"></i> <span
					class="title">${sysfun.displayName}</span> <span class="selected"></span>
					<span class="arrow open"></span>
				</a>
				<ul class="sub-menu">
					<c:forEach items="${sysfun.childs}" var="childs"
						varStatus="childstatus">
						<c:choose>
							<c:when test="${childstatus.first}">
								<li class="active">
							</c:when>
							<c:otherwise>
								<li class="">
							</c:otherwise>
						</c:choose>
						<a href="${rc.contextPath }${childs.nodeUrl}"> <i class="${childs.icon}"></i>${childs.displayName}</a>
						</li>
					</c:forEach>
				</ul>
				</li>
			</c:forEach>
		</ul>
		<!-- END SIDEBAR MENU -->
	</div>
</div>
<!-- END SIDEBAR -->