<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Share My Office | UserPage</title>
<!-- Custom Theme files -->
<link rel="icon" type="img/ico" href="images/smo.ico">
<link href="css/user-landing.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-64561359-1', 'auto');
  ga('send', 'pageview');

</script>
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Space for Startups, Rent an Office, Space for Freelancers , Freelancers Workstation, Workspace , Startups , Workspace for Startups" />
<meta name="description" content="We are here to provide you a hassle-free platform to keep you connected with the best available workspace in your preferred location." />
<style>
.pls{
display:none;
}
</style>
<!--Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<!--Google Fonts-->
</head>
<body>

<div class="container-fluid">
	<div class="row" style="margin-top: 0.5em">
		<div class="col-md-12">
			<div class="row">
				<div class="col-md-4">
					<img src="images/logo.png" style="width:300px;height: 100px"/>
				</div>
				<div class="col-md-8">
				
					<ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="javascipt:void(0)" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i><span id="uemail" style="color: white"></span> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                       
                        <li>
                            <a href="rent"><i class="fa fa-fw fa-gear"></i> Rent a Space</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="logout"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
				</div>
			</div>
		</div>
	</div>
	<div class="row" style="margin-top: 3em">
		<div class="col-md-12">
		<br/>
			<h2 style="color: #ffffff; text-align:center;line-height: 1.3em">Rent your underutilized work space and also avail office space at reasonable prices !!</h2>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<center><div class="fb-like" style="margin-top: 2em" data-href="https://www.facebook.com/sharemyoffice.in" data-layout="button_count" data-action="like" data-show-faces="true"
					data-share="true"></div></center>
					<div style="text-align: center; margin-top: 3.6em">
					<a class="cust_btn1" href="rent" style="margin-right: 50px">Rent a Space?</a>
					<a class="cust_btn2" href="need">Need a Space?</a>
					</div>
					
				
			</div>
		</div>
	<div class="row">
		<div class="col-md-12">
		<div class="copyright">
	 <p>2015 &copy Share My Office All rights reserved </p>
</div>	
		</div>
	</div>
	<div id="fb-root"></div>
	<a href="javascript.void(0);" id="srelbutton" style="display:none"></a>
</div>
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jstorage.js"></script>
<script>
$(document).ready(function(){
	$('#uemail').text($.jStorage.get('email'));
	
});
</script>
<script>
(function(d, s, id) {
	var js, fjs = d.getElementsByTagName(s)[0];
	if (d.getElementById(id))
		return;
	js = d.createElement(s);
	js.id = id;
	js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.3&appId=196836407142144";
	fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));
</script>
</body>
</html>