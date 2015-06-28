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
<link href="css/rent.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all"/>
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
				<h2 class="white">Step 1: Post Your Rental Details</h2>
				</div>
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

	<div class="row">
		<div class="col-md-12">
		  <div class="container" style="border-top: 1px solid white;">
		  <form action="rentdata" method="post">
			<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<h5 class="control-label white">
								Office Name<span class="text-danger">*</span>
							</h5>
							<input required type="text" name="offname" class="form-control "
								placeholder="Name of your office ...">
						</div>
						<div class="form-group">
							<h5 class="control-label white">
								Office Address<span class="text-danger">*</span>
							</h5>
							<input required type="text" name="offadd" class="form-control "
								placeholder="Your office address ...">
						</div>
						<div class="form-group">
							<h5 class="control-label white">
								State<span class="text-danger">*</span>
							</h5>
							<select required class="form-control input-group-sm" name="state">
								<option value="" disabled selected>Select State</option>
								<option value="TN">TN</option>
								<option value="KL">KL</option>
								
								<c:forEach var="state" items="${statelist}">
									<option value="${state}">${state}</option>
								</c:forEach>

							</select>

						</div>
						<div class="form-group">
							<h5 class="control-label white">
								City<span class="text-danger">*</span>
							</h5>
							<select required class="form-control input-group-sm" name="city" id="city">
								<option value="" disabled selected>Select City</option>
								<option value="MAA">MAA</option>
								<option value="TLY">TLY</option>

							</select>

						</div>
						<div class="form-group">
							<h5 class="control-label white">
								Pincode<span class="text-danger">*</span>
							</h5>
							<input required type="text" name="pincode" class="form-control "
								placeholder="Name of your office ..." maxlength="6">
						</div>

					</div>
					<div class="col-md-6">
						<div class="form-group">
							<h5 class="control-label white">
								Description
							</h5>
							<textarea  type="text" name="description" class="form-control "
								placeholder="Description about your workspace ..."> </textarea>
						</div>
						<div class="form-group">
							<h5 class="control-label white">
								Office Space / Seats<span class="text-danger">*</span>
							</h5>
							<input required type="text" name="offspace" class="form-control "
								placeholder="Space in Sq.ft / No of seats available ...">
						</div>
						<div class="form-group">
							<h5 class="control-label white">
								Office Timing<span class="text-danger">*</span>
							</h5>
							<input reaquired type="text" name="offtime" class="form-control "
								placeholder="Work timing of your office .... Egs: 9AM to 6PM">
						</div>
						<div class="form-group">
							<h5 class="control-label white">
								Rent cost<span class="text-danger">*</span>
							</h5>
							<input required type="text" name="cost" class="form-control "
								placeholder="Rent Cost ...">
						</div>
						<div class="form-group">
							<h5 class="control-label white">
								Office Website
							</h5>
							<input type="text" name="cost" class="form-control "
								placeholder="Website address if available ...">
						</div>
					</div>
					<div class="col-md-12">
					<form class="form-horizontal">
<fieldset class="whitechk">

<!-- Form Name -->
<legend class="white">Basic Aminities</legend>

<!-- Multiple Checkboxes (inline) -->
<div class="form-group">
  <div class="col-md-12">
  <div class="row">
  <div class="col-md-3">
  <label class="checkbox-inline" for="BasicAminities-0">
     <i class="fa fa-wifi"></i>&nbsp; <input type="checkbox" name="BasicAminities" id="BasicAminities-0" value="1">
      Internet / WiFi
    </label>
    </div>
  <div class="col-md-3">
  <label class="checkbox-inline" for="BasicAminities-1">
     <i class="fa fa-print"></i>&nbsp; <input type="checkbox" name="BasicAminities" id="BasicAminities-1" value="2">
      Printer / Scanner
    </label>
  </div>
  <div class="col-md-3">
  <label class="checkbox-inline" for="BasicAminities-2">
     <i class="fa fa-car"></i>&nbsp; <input type="checkbox" name="BasicAminities" id="BasicAminities-2" value="3">
      Four wheelers Parking
    </label>
  </div>
  <div class="col-md-3">
  <label class="checkbox-inline" for="BasicAminities-3">
     <i class="fa fa-fax"></i>&nbsp; <input type="checkbox" name="BasicAminities" id="BasicAminities-3" value="4">
      Landline / Fax
    </label>
  </div>
  </div>
   <div class="row">
  <div class="col-md-3">
  <label class="checkbox-inline" for="BasicAminities-4">
      <i class="fa fa-square-o"></i>&nbsp;<input type="checkbox" name="BasicAminities" id="BasicAminities-4" value="5">
      Whiteboard / Projector
    </label>
  </div>
  <div class="col-md-3">
   <label class="checkbox-inline" for="BasicAminities-5">
     <i class="fa fa-connectdevelop"></i>&nbsp; <input type="checkbox" name="BasicAminities" id="BasicAminities-5" value="6">
      Conference room
    </label>
  </div>
  <div class="col-md-3">
  <label class="checkbox-inline" for="BasicAminities-6">
      <i class="fa fa-plug"></i>&nbsp;<input type="checkbox" name="BasicAminities" id="BasicAminities-6" value="7">
      Air Conditioning (AC)
    </label>
  </div>
  <div class="col-md-3">
  <label class="checkbox-inline" for="BasicAminities-7">
     <i class="fa fa-coffee"></i>&nbsp; <input type="checkbox" name="BasicAminities" id="BasicAminities-7" value="8">
      Coffee / Tea Dispenser
    </label>
  </div>
  </div>
   <div class="row">
  <div class="col-md-3">
  <label class="checkbox-inline" for="BasicAminities-8">
     <i class="fa fa-cutlery"></i>&nbsp; <input type="checkbox" name="BasicAminities" id="BasicAminities-8" value="9">
      Cafeteria / Dining Hall
    </label>
  </div>
  <div class="col-md-3">
   <label class="checkbox-inline" for="BasicAminities-9">
     <i class="fa fa-home"></i>&nbsp; <input type="checkbox" name="BasicAminities" id="BasicAminities-9" value="10">
      Reception Area
    </label>
  </div>
  <div class="col-md-3">
  <label class="checkbox-inline" for="BasicAminities-10">
     <i class="fa fa-crosshairs"></i>&nbsp; <input type="checkbox" name="BasicAminities" id="BasicAminities-10" value="11">
      Locker / Cupboard
    </label>
  </div>
  <div class="col-md-3">
    <label class="checkbox-inline" for="BasicAminities-11">
     <i class="fa fa-train"></i>&nbsp; <input type="checkbox" name="BasicAminities" id="BasicAminities-11" value="12">
      Bus / Train Stations
    </label>
  </div>
  </div>
    
  
  </div>
  
  <div class="col-md-12" style="border-top: 1px solid white; ">
  	<button class="btn btn-primary btn-large pull-right" type="submit" style="margin-left: 20px;margin-top : 20px;" id="postRental">Post My Rental</button>
  	<a class="btn btn-danger btn-large pull-right" style="margin-left: 20px;margin-top : 20px;" id="cancel" href="userlanding">Cancel</a>
  </div>
</div>

</fieldset>
</form>
					
					</div>
				</div>
	</form>				
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
	
</div>
<script src="js/jquery-2.1.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jstorage.js"></script>
<script>
$(document).ready(function(){
	$('#uemail').text($.jStorage.get('email'));
	
});
</script>

</body>
</html>