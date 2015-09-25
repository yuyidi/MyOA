<head>
		<script>
				jQuery(document).ready(function() {
					Index.init();
					Index.initDashboardDaterange();
					Tasks.initDashboardWidget();	
					Index.initJQVMAP(); // init index page's custom scripts
					Index.initCalendar(); // init index page's custom scripts
					// Index.initCharts(); // init index page's custom scripts
					Index.initChat();
					// Index.initMiniCharts();
					Index.meetingtype();
					Index.meetings();
					Index.tasks();
				});
		</script>		
</head>
<body>
<!-- BEGIN PAGE HEADER-->
<h3 class="page-title">
			控制面板 <small>报告 & 汇总</small>
</h3>
<div class="page-bar">
	<ul class="page-breadcrumb">
		<li>
			<i class="fa fa-home"></i>
			<a href="${rc.contextPath}/index">Home</a>
			<i class="fa fa-angle-right"></i>
		</li>
		<li>
			<a href="#">控制面板</a>
		</li>
	</ul>
	<div class="page-toolbar">
		<div id="dashboard-report-range" class="pull-right tooltips btn btn-fit-height grey-salt" data-placement="top" data-original-title="Change dashboard date range">
			<i class="icon-calendar"></i>&nbsp;
			<span class="thin uppercase visible-lg-inline-block">&nbsp;</span>&nbsp;
			<i class="fa fa-angle-down"></i>
		</div>
	</div>
</div>
<!-- END PAGE HEADER-->
<!-- BEGIN DASHBOARD STATS -->
<div class="row">
	<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
		<div class="dashboard-stat blue-madison">
			<div class="visual">
				<i class="fa fa-comments"></i>
			</div>
			<div class="details">
				<div class="number">
					1349
				</div>
				<div class="desc">
					消息
				</div>
			</div>
			<a class="more" href="#">
						更多 <i class="m-icon-swapright m-icon-white"></i>
			</a>
		</div>
	</div>
	<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
		<div class="dashboard-stat red-intense">
			<div class="visual">
				<i class="fa fa-bar-chart-o"></i>
			</div>
			<div class="details">
				<div class="number">
					12,5M$
				</div>
				<div class="desc">
					日程
				</div>
			</div>
			<a class="more" href="#">
						更多 <i class="m-icon-swapright m-icon-white"></i>
			</a>
		</div>
	</div>
	<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
		<div class="dashboard-stat green-haze">
			<div class="visual">
				<i class="fa fa-shopping-cart"></i>
			</div>
			<div class="details">
				<div class="number">
					549
				</div>
				<div class="desc">
					考勤
				</div>
			</div>
			<a class="more" href="#">
						更多 <i class="m-icon-swapright m-icon-white"></i>
						</a>
		</div>
	</div>
	<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
		<div class="dashboard-stat purple-plum">
			<div class="visual">
				<i class="fa fa-globe"></i>
			</div>
			<div class="details">
				<div class="number">
					+89%
				</div>
				<div class="desc">
					便签
				</div>
			</div>
			<a class="more" href="#">
						更多 <i class="m-icon-swapright m-icon-white"></i>
						</a>
		</div>
	</div>
</div>
<!-- END DASHBOARD STATS -->
<div class="clearfix">
</div>
<div class="row ">
	<div class="col-md-6 col-sm-6">
		<div class="portlet box blue-steel">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-bell-o"></i>日程安排
				</div>
				<div class="actions">
					<div class="btn-group meeting">
						<a class="btn btn-sm btn-default dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
									过滤条件 <i class="fa fa-angle-down"></i>
						</a>
								<div class="dropdown-menu hold-on-click dropdown-checkboxes pull-right meeting-menu">
									
								</div>
					</div>
				</div>
			</div>
			<div class="portlet-body">
				<div class="scroller" style="height: 300px;" data-always-visible="1" data-rail-visible="0">
					<ul class="feeds meetings">
					</ul>
				</div>
				<div class="scroller-footer">
					<div class="btn-arrow-link pull-right">
						<a href="#">查看更多</a>
						<i class="icon-arrow-right"></i>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="col-md-6 col-sm-6">
		<div class="portlet box green-haze tasks-widget">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-check"></i>任务
				</div>
				<div class="tools">
					<a href="#portlet-config" data-toggle="modal" class="config">
					</a>
					<a href="" class="reload">
					</a>
					<a href="javascript:;" class="fullscreen">
					</a>
				</div>
				<div class="actions">
					<div class="btn-group">
						<a class="btn btn-default btn-sm dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
									更多 <i class="fa fa-angle-down"></i>
									</a>
						<ul class="dropdown-menu pull-right">
							<li>
								<a href="#">
									<i class="i"></i> All Project </a>
							</li>
							<li class="divider">
							</li>
							<li>
								<a href="#">
											AirAsia </a>
							</li>
							<li>
								<a href="#">
											Cruise </a>
							</li>
							<li>
								<a href="#">
											HSBC </a>
							</li>
							<li class="divider">
							</li>
							<li>
								<a href="#">
											Pending <span class="badge badge-danger">
											4 </span>
											</a>
							</li>
							<li>
								<a href="#">
											Completed <span class="badge badge-success">
											12 </span>
											</a>
							</li>
							<li>
								<a href="#">
											Overdue <span class="badge badge-warning">
											9 </span>
											</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="portlet-body">
				<div class="task-content">
					<div class="scroller" style="height: 305px;" data-always-visible="1" data-rail-visible1="1">
						<!-- START TASK LIST -->
						<ul class="task-list tasks">
							
						</ul>
						<!-- END START TASK LIST -->
					</div>
				</div>
				<div class="task-footer">
					<div class="btn-arrow-link pull-right">
						<a href="#">查看更多</a>
						<i class="icon-arrow-right"></i>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="clearfix">
</div>
<div class="row ">
	<div class="col-md-6 col-sm-6">
		<!-- BEGIN REGIONAL STATS PORTLET-->
		<div class="portlet">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-globe"></i>区域统计
				</div>
				<div class="tools">
					<a href="" class="collapse">
					</a>
					<a href="#portlet-config" data-toggle="modal" class="config">
					</a>
					<a href="" class="reload">
					</a>
					<a href="" class="fullscreen">
					</a>
					<a href="" class="remove">
					</a>
				</div>
			</div>
			<div class="portlet-body">
				<div id="region_statistics_loading">
					<img src="${rc.contextPath}/assets/admin/layout/img/loading.gif" alt="loading" />
				</div>
				<div id="region_statistics_content" class="display-none">
					<div class="btn-toolbar margin-bottom-10">
						<div class="btn-group" data-toggle="buttons">
							<a href="" class="btn default btn-sm active">
										Users </a>
							<a href="" class="btn default btn-sm">
										Orders </a>
						</div>
						<div class="btn-group pull-right">
							<a href="" class="btn default btn-sm dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
										Select Region <span class="fa fa-angle-down">
										</span>
										</a>
							<ul class="dropdown-menu pull-right">
								<li>
									<a href="javascript:;" id="regional_stat_world">
												World </a>
								</li>
								<li>
									<a href="javascript:;" id="regional_stat_usa">
												USA </a>
								</li>
								<li>
									<a href="javascript:;" id="regional_stat_europe">
												Europe </a>
								</li>
								<li>
									<a href="javascript:;" id="regional_stat_russia">
												Russia </a>
								</li>
								<li>
									<a href="javascript:;" id="regional_stat_germany">
												Germany </a>
								</li>
							</ul>
						</div>
					</div>
					<div id="vmap_world" class="vmaps display-none">
					</div>
					<div id="vmap_usa" class="vmaps display-none">
					</div>
					<div id="vmap_europe" class="vmaps display-none">
					</div>
					<div id="vmap_russia" class="vmaps display-none">
					</div>
					<div id="vmap_germany" class="vmaps display-none">
					</div>
				</div>
			</div>
		</div>
		<!-- END REGIONAL STATS PORTLET-->
	</div>
	<div class="col-md-6 col-sm-6">
		<!-- BEGIN PORTLET-->
		<div class="portlet paddingless">
			<div class="portlet-title line">
				<div class="caption">
					<i class="fa fa-bell-o"></i>提醒
				</div>
				<div class="tools">
					<a href="" class="collapse">
					</a>
					<a href="#portlet-config" data-toggle="modal" class="config">
					</a>
					<a href="" class="reload">
					</a>
					<a href="" class="remove">
					</a>
				</div>
			</div>
			<div class="portlet-body">
				<!--BEGIN TABS-->
				<div class="tabbable tabbable-custom">
					<ul class="nav nav-tabs">
						<li class="active">
							<a href="#tab_1_1" data-toggle="tab">
										System </a>
						</li>
						<li>
							<a href="#tab_1_2" data-toggle="tab">
										Activities </a>
						</li>
						<li>
							<a href="#tab_1_3" data-toggle="tab">
										Recent Users </a>
						</li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane active" id="tab_1_1">
							<div class="scroller" style="height: 290px;" data-always-visible="1" data-rail-visible="0">
								<ul class="feeds">
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-success">
														<i class="fa fa-bell-o"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														You have 4 pending tasks. <span class="label label-sm label-danger ">
																	Take action <i class="fa fa-share"></i>
																	</span>
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												Just now
											</div>
										</div>
									</li>
									<li>
										<a href="#">
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-success">
															<i class="fa fa-bell-o"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															New version v1.4 just lunched!
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													20 mins
												</div>
											</div>
										</a>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-danger">
														<i class="fa fa-bolt"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														Database server #12 overloaded. Please fix the issue.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												24 mins
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-info">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												30 mins
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-success">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												40 mins
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-warning">
														<i class="fa fa-plus"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New user registered.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												1.5 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-success">
														<i class="fa fa-bell-o"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														Web server hardware needs to be upgraded. <span class="label label-sm label-default ">
																	Overdue </span>
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												2 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-default">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												3 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-warning">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												5 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-info">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												18 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-default">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												21 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-info">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												22 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-default">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												21 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-info">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												22 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-default">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												21 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-info">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												22 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-default">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												21 hours
											</div>
										</div>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-info">
														<i class="fa fa-bullhorn"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														New order received. Please take care of it.
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												22 hours
											</div>
										</div>
									</li>
								</ul>
							</div>
						</div>
						<div class="tab-pane" id="tab_1_2">
							<div class="scroller" style="height: 290px;" data-always-visible="1" data-rail-visible1="1">
								<ul class="feeds">
									<li>
										<a href="#">
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-success">
															<i class="fa fa-bell-o"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															New user registered
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													Just now
												</div>
											</div>
										</a>
									</li>
									<li>
										<a href="#">
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-success">
															<i class="fa fa-bell-o"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															New order received
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													10 mins
												</div>
											</div>
										</a>
									</li>
									<li>
										<div class="col1">
											<div class="cont">
												<div class="cont-col1">
													<div class="label label-sm label-danger">
														<i class="fa fa-bolt"></i>
													</div>
												</div>
												<div class="cont-col2">
													<div class="desc">
														Order #24DOP4 has been rejected. <span class="label label-sm label-danger ">
																	Take action <i class="fa fa-share"></i>
																	</span>
													</div>
												</div>
											</div>
										</div>
										<div class="col2">
											<div class="date">
												24 mins
											</div>
										</div>
									</li>
									<li>
										<a href="#">
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-success">
															<i class="fa fa-bell-o"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															New user registered
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													Just now
												</div>
											</div>
										</a>
									</li>
									<li>
										<a href="#">
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-success">
															<i class="fa fa-bell-o"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															New user registered
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													Just now
												</div>
											</div>
										</a>
									</li>
									<li>
										<a href="#">
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-success">
															<i class="fa fa-bell-o"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															New user registered
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													Just now
												</div>
											</div>
										</a>
									</li>
									<li>
										<a href="#">
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-success">
															<i class="fa fa-bell-o"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															New user registered
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													Just now
												</div>
											</div>
										</a>
									</li>
									<li>
										<a href="#">
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-success">
															<i class="fa fa-bell-o"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															New user registered
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													Just now
												</div>
											</div>
										</a>
									</li>
									<li>
										<a href="#">
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-success">
															<i class="fa fa-bell-o"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															New user registered
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													Just now
												</div>
											</div>
										</a>
									</li>
									<li>
										<a href="#">
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-success">
															<i class="fa fa-bell-o"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															New user registered
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													Just now
												</div>
											</div>
										</a>
									</li>
								</ul>
							</div>
						</div>
						<div class="tab-pane" id="tab_1_3">
							<div class="scroller" style="height: 290px;" data-always-visible="1" data-rail-visible1="1">
								<div class="row">
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Robert Nilson </a>
												<span class="label label-sm label-success label-mini">
															Approved </span>
											</div>
											<div>
												29 Jan 2013 10:45AM
											</div>
										</div>
									</div>
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Lisa Miller </a>
												<span class="label label-sm label-info">
															Pending </span>
											</div>
											<div>
												19 Jan 2013 10:45AM
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Eric Kim </a>
												<span class="label label-sm label-info">
															Pending </span>
											</div>
											<div>
												19 Jan 2013 12:45PM
											</div>
										</div>
									</div>
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Lisa Miller </a>
												<span class="label label-sm label-danger">
															In progress </span>
											</div>
											<div>
												19 Jan 2013 11:55PM
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Eric Kim </a>
												<span class="label label-sm label-info">
															Pending </span>
											</div>
											<div>
												19 Jan 2013 12:45PM
											</div>
										</div>
									</div>
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Lisa Miller </a>
												<span class="label label-sm label-danger">
															In progress </span>
											</div>
											<div>
												19 Jan 2013 11:55PM
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Eric Kim </a>
												<span class="label label-sm label-info">
															Pending </span>
											</div>
											<div>
												19 Jan 2013 12:45PM
											</div>
										</div>
									</div>
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Lisa Miller </a>
												<span class="label label-sm label-danger">
															In progress </span>
											</div>
											<div>
												19 Jan 2013 11:55PM
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Eric Kim </a>
												<span class="label label-sm label-info">
															Pending </span>
											</div>
											<div>
												19 Jan 2013 12:45PM
											</div>
										</div>
									</div>
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Lisa Miller </a>
												<span class="label label-sm label-danger">
															In progress </span>
											</div>
											<div>
												19 Jan 2013 11:55PM
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Eric Kim </a>
												<span class="label label-sm label-info">
															Pending </span>
											</div>
											<div>
												19 Jan 2013 12:45PM
											</div>
										</div>
									</div>
									<div class="col-md-6 user-info">
										<img alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar.png" class="img-responsive" />
										<div class="details">
											<div>
												<a href="#">
															Lisa Miller </a>
												<span class="label label-sm label-danger">
															In progress </span>
											</div>
											<div>
												19 Jan 2013 11:55PM
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--END TABS-->
			</div>
		</div>
		<!-- END PORTLET-->
	</div>
</div>
<div class="clearfix">
</div>
<div class="row ">
	<div class="col-md-6 col-sm-6">
		<!-- BEGIN PORTLET-->
		<div class="portlet box blue-madison calendar">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-calendar"></i>日历
				</div>
			</div>
			<div class="portlet-body light-grey">
				<div id="calendar">
				</div>
			</div>
		</div>
		<!-- END PORTLET-->
	</div>
	<div class="col-md-6 col-sm-6">
		<!-- BEGIN PORTLET-->
		<div class="portlet">
			<div class="portlet-title line">
				<div class="caption">
					<i class="fa fa-comments"></i>聊天
				</div>
				<div class="tools">
					<a href="" class="collapse">
					</a>
					<a href="#portlet-config" data-toggle="modal" class="config">
					</a>
					<a href="" class="reload">
					</a>
					<a href="" class="fullscreen">
					</a>
					<a href="" class="remove">
					</a>
				</div>
			</div>
			<div class="portlet-body" id="chats">
				<div class="scroller" style="height: 352px;" data-always-visible="1" data-rail-visible1="1">
					<ul class="chats">
						<li class="in">
							<img class="avatar" alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar1.jpg" />
							<div class="message">
								<span class="arrow">
											</span>
								<a href="#" class="name">
											Bob Nilson </a>
								<span class="datetime">
											at 20:09 </span>
								<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
							</div>
						</li>
						<li class="out">
							<img class="avatar" alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar2.jpg" />
							<div class="message">
								<span class="arrow">
											</span>
								<a href="#" class="name">
											Lisa Wong </a>
								<span class="datetime">
											at 20:11 </span>
								<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
							</div>
						</li>
						<li class="in">
							<img class="avatar" alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar1.jpg" />
							<div class="message">
								<span class="arrow">
											</span>
								<a href="#" class="name">
											Bob Nilson </a>
								<span class="datetime">
											at 20:30 </span>
								<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
							</div>
						</li>
						<li class="out">
							<img class="avatar" alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar3.jpg" />
							<div class="message">
								<span class="arrow">
											</span>
								<a href="#" class="name">
											Richard Doe </a>
								<span class="datetime">
											at 20:33 </span>
								<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
							</div>
						</li>
						<li class="in">
							<img class="avatar" alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar3.jpg" />
							<div class="message">
								<span class="arrow">
											</span>
								<a href="#" class="name">
											Richard Doe </a>
								<span class="datetime">
											at 20:35 </span>
								<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
							</div>
						</li>
						<li class="out">
							<img class="avatar" alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar1.jpg" />
							<div class="message">
								<span class="arrow">
											</span>
								<a href="#" class="name">
											Bob Nilson </a>
								<span class="datetime">
											at 20:40 </span>
								<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
							</div>
						</li>
						<li class="in">
							<img class="avatar" alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar3.jpg" />
							<div class="message">
								<span class="arrow">
											</span>
								<a href="#" class="name">
											Richard Doe </a>
								<span class="datetime">
											at 20:40 </span>
								<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
							</div>
						</li>
						<li class="out">
							<img class="avatar" alt="" src="${rc.contextPath}/assets/admin/layout/img/avatar1.jpg" />
							<div class="message">
								<span class="arrow">
											</span>
								<a href="#" class="name">
											Bob Nilson </a>
								<span class="datetime">
											at 20:54 </span>
								<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. sed diam nonummy nibh euismod tincidunt ut laoreet. </span>
							</div>
						</li>
					</ul>
				</div>
				<div class="chat-form">
					<div class="input-cont">
						<input class="form-control" type="text" placeholder="输入你想说的话..." />
					</div>
					<div class="btn-cont">
						<span class="arrow">
									</span>
						<a href="" class="btn blue icn-only">
							<i class="fa fa-check icon-white"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
		<!-- END PORTLET-->
	</div>
</div>
</body>
