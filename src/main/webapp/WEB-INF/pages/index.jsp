<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Share My Office | Subscribe</title>
<!-- Custom Theme files -->
<link rel="icon" type="img/ico" href="images/smo.ico">
<link href="css/landing-style.css" rel="stylesheet" type="text/css" media="all"/>
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
				
					<ul class="nav nav-pills pull-right">
						
						<li class="active">
							<a href="signup">Login / SignUp</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="row" style="margin-top: 3em">
		<div class="col-md-12">
		<br/>
			<h2 style="color: #ffffff; text-align:center;line-height: 1.3em">Are you a Freelancer / StartUp looking for affordable workspace?<br/>
			Are you an SME looking to rent out your un-utilized workspace?</h2>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<center><div class="fb-like" style="margin-top: 2em" data-href="https://www.facebook.com/sharemyoffice.in" data-layout="button_count" data-action="like" data-show-faces="true"
					data-share="true"></div></center>
				<div class="search">
	<i>  </i>
	<div class="s-bar">
	   <form>
		<input type="text" value="Your Email..." required onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Email...';}" id="semail">
		<input type="button"  value="Subscribe" id="sbutton"/>
	  </form>
	  <span style="color: #fff; font-weight: bold;display:none" id="ty_note">Thank You for Subscribing!!!</span>
	</div>
	
	<p>Hurry! First 50 subscribers entitled to our premium listing services for a LIFETIME.</p>
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
<script>
$(document).ready(function(){
	$("#sbutton").click(function(){
	var semail=$("#semail").val();
	var hrefdata="http://talentex.in/sharemyoffice/subscribe?email="+semail;
	$("#srelbutton").attr("href",hrefdata);
	window.location.href = hrefdata;
	$("#ty_note").show();
	});
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