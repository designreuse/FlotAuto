<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div id="navigation">
	<div class="container-fluid">
		<a href="#" id="brand">FlotAuto</a> <a href="#" class="toggle-nav"
			rel="tooltip" data-placement="bottom" title="Basculer navigation"><i
			class="icon-reorder"></i></a>
		<ul class='main-nav'>
			<li id="dashboard"><a href="/FlotAuto/dashboard/overall.action"><i
					class="icon-home"></i> <span>Tableau de bord</span> </a></li>
			<li id="vehicle"><a href="/FlotAuto/vehicle/list.action"> <i
					class="icon-home"></i> <span>V�hicule</span>
			</a></li>
			<li id="employee"><a href="/FlotAuto/employee/list.action">
					<i class="icon-home"></i> <span>Employ�</span>
			</a></li>
			<li id="maintenance"><a href="/FlotAuto/maintenance/list.action"><i
					class="icon-home"></i> <span>Maintenance</span> </a></li>
			<li id="workorder"><a href="/FlotAuto/workorder/list.action"><i
					class="icon-home"></i> <span>Ordre de travail</span> </a></li>
			<li id="supplier"><a href="/FlotAuto/supplier/list.action">
					<i class="icon-home"></i> <span>Fournisseur</span>
			</a></li>
		</ul>
		<div class="user">
			<ul class="icon-nav">
				<li class="dropdown sett"><a href="#" class='dropdown-toggle'
					data-toggle="dropdown"><i class="icon-cog"></i> </a>
					<ul class="dropdown-menu pull-right theme-settings">
						<li><span>Disposition</span>
							<div class="version-toggle">
								<a href="#" class='set-fixed'>Fixe</a> <a href="#"
									class="active set-fluid">Fluide</a>
							</div></li>
						<li><span>Menu haut</span>
							<div class="topbar-toggle">
								<a href="#" class='set-topbar-fixed'>Fixe</a> <a href="#"
									class="active set-topbar-default">Normal</a>
							</div></li>
						<li><span>Menu gauche</span>
							<div class="sidebar-toggle">
								<a href="#" class='set-sidebar-fixed'>Fixe</a> <a href="#"
									class="active set-sidebar-default">Normal</a>
							</div></li>
					</ul></li>
				<li class='dropdown colo'><a href="#" class='dropdown-toggle'
					data-toggle="dropdown"><i class="icon-tint"></i> </a>
					<ul class="dropdown-menu pull-right theme-colors">
						<li class="subtitle">Th�mes</li>
						<li><span class='red'></span> <span class='orange'></span> <span
							class='green'></span> <span class="brown"></span> <span
							class="blue"></span> <span class='lime'></span> <span
							class="teal"></span> <span class="purple"></span> <span
							class="pink"></span> <span class="magenta"></span> <span
							class="grey"></span> <span class="darkblue"></span> <span
							class="lightred"></span> <span class="lightgrey"></span> <span
							class="satblue"></span> <span class="satgreen"></span></li>
					</ul></li>
				<li><a href="more-locked.html" class='lock-screen'
					rel='tooltip' title="Verouiller" data-placement="bottom"><i
						class="icon-lock"></i> </a></li>
			</ul>
			<div class="dropdown">
				<a href="#" class='dropdown-toggle' data-toggle="dropdown"><sec:authentication property="principal.username" /> 
					<img src="/FlotAuto/jsp/img/demo/user-avatar.jpg" alt="">
				</a>
				<ul class="dropdown-menu pull-right">
					<li><a href="more-userprofile.html">Profil</a></li>
					<li><a href="#">Compte</a></li>
					<li><a href="/FlotAuto/j_spring_security_logout">D�connexion</a></li>
				</ul>
			</div>
		</div>
		<a href="#" class='toggle-mobile'><i class="icon-reorder"></i> </a>
	</div>
</div>