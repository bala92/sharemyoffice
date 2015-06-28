

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link>Share My Office | SignUp</link>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/signup.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Space for Startups, Rent an Office, Space for Freelancers , Freelancers Workstation, Workspace , Startups , Workspace for Startups" />
<meta name="description" content="We are here to provide you a hassle-free platform to keep you connected with the best available workspace in your preferred location." />

<!--Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<!--Google Fonts-->
</head>
<body>
<div class="row" style="margin-top: 0.5em">
		<div class="col-md-12">
			<div class="row">
				<div class="col-md-4">
					<img src="images/logo.png" style="width:300px;height: 100px"/>
				</div>
				<div class="col-md-8">
				</div>
			
			</div>
		</div>
	</div>


	 <div class="logmod">
  <div class="logmod__wrapper">
    
    <div class="logmod__container">
      <ul class="logmod__tabs">
        <li data-tabtar="lgm-2"><a href="#">Login</a></li>
        <li data-tabtar="lgm-1"><a href="#">Sign Up</a></li>
      </ul>
      <div class="logmod__tab-wrapper">
      <div class="logmod__tab lgm-1">
        <div class="logmod__heading">
          <span class="logmod__heading-subtitle">Enter your personal details <strong>to create an acount</strong></span>
        </div>
        <div class="logmod__form">
          <form accept-charset="utf-8" action="register" class="simform" method="POST">
           
            <div class="sminputs">
              <div class="input string optional">
                <label class="string optional" for="user-name">Name*</label>
                <input required class="string optional form-control" maxlength="25" id="user-name" placeholder="Full Name" type="text" name="name" size="50" />
              </div>
              <div class="input string optional">
                <label class="string optional" for="user-phone" pattern="^[6789]\d{9}$">Phone*</label>
                <input required class="string optional form-control" maxlength="10" id="user-phone" placeholder="Mobile Number" name="phone" type="text" size="50" />
              </div>
            </div>
            <div class="sminputs">
              <div class="input full">
                <label class="string optional" for="user-email">Email*</label>
                <input required  class="string optional form-control email" maxlength="255" id="user-email" placeholder="Email" name="email" type="email" size="50" />
              </div>
            </div>
           
            <div class="simform__actions">
              <button class="sumbit" name="commit" type="sumbit" id="csub" value="Create Account">Create Account</button>
              <span class="simform__actions-sidetext">By creating an account you agree to our <a class="special" href="#" target="_blank" role="link">Terms & Privacy</a></span>
            </div> 
          </form>
        </div> 
      </div>
      <div class="logmod__tab lgm-2">
        <div class="logmod__heading">
          <span class="logmod__heading-subtitle">Enter your email and password <strong>to sign in</strong></span>
        </div> 
        <div class="logmod__form">
          <form accept-charset="utf-8" action="loginAuth" method="POST" class="simform">
            <div class="sminputs">
              <div class="input full">
                <label class="string optional" for="user-name">Email*</label>
                <input class="string optional form-control email" maxlength="255" id="user-email" placeholder="Email" type="email" name="email" size="50" />
              </div>
            </div>
            <div class="sminputs">
              <div class="input full">
                <label class="string optional" for="user-pw">Password *</label>
                <input class="string optional form-control" maxlength="255" id="user-pw" placeholder="Password" type="password" name="password" size="50" />
                						<span class="hide-password">Show</span>
              </div>
            </div>
            <div class="simform__actions">
              <button class="sumbit"  type="sumbit" value="Log In" id="osub">Log In</button>
              <span class="simform__actions-sidetext"><a class="special" role="link" href="#">Forgot your password?<br>Click here</a></span>
            </div> 
          </form>
        </div> 
        <div class="logmod__alter">
          <div class="logmod__alter-container">
            <a href="javascript:void(0)" onclick="loginfb();" class="connect facebook">
              <div class="connect__icon">
                <i class="fa fa-facebook"></i>
              </div>
              <div class="connect__context">
                <span>Sign in with <strong>Facebook</strong></span>
              </div>
            </a>
            
          </div>
        </div>
          </div>
      </div>
    </div>
  </div>
  <div id="fb-root"></div>
  
</div>
<script>
(function() {
	var e = document.createElement('script');
	e.src = document.location.protocol
			+ '//connect.facebook.net/en_US/all.js';
	e.async = true;
	document.getElementById('fb-root').appendChild(e);
}());
</script>
<script src="js/jquery-2.1.1.min.js"></script>
<script src="js/signup.js"></script>
<script src="js/jstorage.js"></script>
<script>
$(document).ready(function(){
	
	$("#csub,#osub").click(function(){
		$.jStorage.set("email",$('.email').val());
	});
});
</script>
<script>

function loginfb() {
	FB.login(function(response) {
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

</script>

</body>
</html>