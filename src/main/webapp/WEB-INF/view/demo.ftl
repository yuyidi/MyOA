<head>
</head>
<body>
	<@myoa_sysfun_tag>
			<#list tag_sysfun_list as sysfun>
				<li class="start active open">
					<a href="javascript:;">
						<i class="${sysfun.icon}"></i>
						<span class="title">${sysfun.displayName}</span>
						<span class="arrow"></span>
					</a>
					<ul class="sub-menu">
						<#list sysfun.childs as child>
						<li class="active">
							<a href="index.html">
								<i class="${child.icon}"></i> ${child.displayName}</a>
						</li>
						</#list>
					</ul>
				</li>
				</#list>
			</@myoa_sysfun_tag>
</body>
