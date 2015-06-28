<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="container">

		<p>Below is an example of the "classic" Facebook Share Button on a
			non-Facebook Web page.</p>
		<div id="fb-root"></div>

		<script
			src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"
			type="text/javascript"></script>
		<a id="share_button" href="javascript:void(0)">FB Share</a> <a
			href="javascript:void(0)" onclick="loginfb()">FB Login</a>

<label>${email}</label>

<label>${name}</label>

		<div class="fb-like"
			data-href="https://www.facebook.com/sharemyoffice.in"
			data-layout="standard" data-action="like" data-show-faces="true"
			data-share="true"></div>

	</div>

	<script type="text/javascript">
		window.fbAsyncInit = function() {
			FB.init({
				appId : '1625507687662203',
				version : 'v2.3',
				status : true, // check login status
				cookie : true, // enable cookies to allow the server to access the session
				xfbml : true
			// parse XFBML
			});
		};

		(function() {
			var e = document.createElement('script');
			e.src = document.location.protocol
					+ '//connect.facebook.net/en_US/all.js';
			e.async = true;
			document.getElementById('fb-root').appendChild(e);
		}());

		$(document)
				.ready(
						function() {
							$('#share_button')
									.click(
											function(e) {
												e.preventDefault();
												FB
														.ui({
															method : 'feed',
															name : 'TalentEx',
															link : 'http://talentex.in',
															picture : 'http://fbtech.in/images/fb_share.jpg',
															caption : 'Click to enroll!!',
															description : 'Talentex having more than 5 years of expertize in helping students to identify their dream job. We at Talentex help you too enroll enlighten and evaluate your professional capabilities and fine tune you to get your dream job.',
															message : ''
														});

											});

						});

		function loginfb() {
			FB
					.login(
							function(response) {
								if (response.authResponse) {
									console
											.log('Welcome!  Fetching your information.... ');
									FB.api('/me', function(response) {
										console.log('Good to see you, '
												+ response.birthday + '.'
												+ response.email);
										   window.location.href = 'http://localhost:8080/Sharemyoffice/fbsignUp?email='+response.email+'&name='+response.name+'';  
									});
								} else {
									console
											.log('User cancelled login or did not fully authorize.');
								}
							}, {
								'scope' : 'email'
							});
		}

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