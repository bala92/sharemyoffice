<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Share My Office | Rent Image</title>
<!-- Custom Theme files -->
<link rel="icon" type="img/ico" href="images/smo.ico">
<link href="css/user-landing.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/uploadimg.css" rel="stylesheet" type="text/css"
	media="all" />

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
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Space for Startups, Rent an Office, Space for Freelancers , Freelancers Workstation, Workspace , Startups , Workspace for Startups" />
<meta name="description"
	content="We are here to provide you a hassle-free platform to keep you connected with the best available workspace in your preferred location." />
<style>
.pls {
	display: none;
}
</style>
<!--Google Fonts-->
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<!--Google Fonts-->
</head>
<body>

	<div class="container-fluid">
		<div class="row" style="margin-top: 0.5em">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-4">
						<img src="images/logo.png" style="width: 300px; height: 100px" />
					</div>
					<div class="col-md-8">
					<h2 class="white">Step 2: Upload Images (Max : 5Nos)</h2>
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
		<div class="row" style="margin-top: 0.2em">
			<div class="col-md-12">
			<div class="container">
				<div class="panel panel-primary" >
								<div class="panel-heading">
									Upload Workspace Image
								</div>
								<div class="panel-body" style="height: 300px">
									<div id="imgcontent" class="row">

						<div class="container_image">
							<div class="upload_form_cont">

								
									<label for="image_file">
										<div id="hed">Please select image file with size less
											then 1 MB</div>
									</label>

									<div id="textbo">
										<input type="file" class="filestyle"
											data-buttonName="btn-primary" id="image_file"
											name="image_file" class="btn btn-primary" onchange="fileSelected();"> 
										<!-- <input type="file" id="image_file" name="image_file" class="filestyle" data-buttonBefore="true" onchange="fileSelected();"> -->
										<!-- <input type="file" name="image_file" id="image_file" onchange="fileSelected();" /> -->
									</div>
								<!-- 	<input type="button" class="btn btn-primary" value="Upload"  id="upload"/>
                                <input type="button" class="btn btn-danger" value="Cancel" id="cancel"  /> -->

									<div id="fileinfo">
										<div id="filename"></div>
										<div id="filesize"></div>
										<div id="filetype"></div>
										<div id="filedim"></div>
									</div>
									<div class="none" id="none">You should select valid image
										files First!</div>
									<div class="none" id="error">
										Only Image Formats Such as BMP/GIF/JPEG/PNG/TIFF Can be
										uploaded<br />You should select valid image files only!
									</div>
									<div class="none" id="error2">An error occurred while
										uploading the file</div>
									<div class="none" id="abort">The upload has been canceled
										by the user or the browser dropped the connection</div>
									<div class="none" id="warnsize">Your file is very big. We
										can't accept it. Please select more small file</div>

									<div id="progress_info">
										<div id="progress"></div>
										<div id="progress_percent"></div>
										<div class="clear_both"></div>
										<div>
											<div id="speed"></div>
											<div id="remaining"></div>
											<div id="b_transfered"></div>
											<div class="clear_both"></div>
										</div>
										<div id="upload_response" style="display: none"></div>
									</div>
								

								<img id="preview" />
							</div>

						</div>
						<div id="dataurl"
							style="position: absolute; bottom: 0; left: 0; width: 100%; height: 20%; border: 2px solid black; overflow: scroll; display: none"></div>
					</div>
					
							</div>
						


<div class="panel panel-footer" style="height: 100px">
<input type="button" class="btn btn-success pull-right" style="margin: 10px;" value="Save"  id="save"/>
<input type="button" class="btn btn-danger pull-right" style="margin: 10px;" value="Cancel"  id="cancel"/>
					<img id="preview1" style="position: relative; bottom: 0; left: 0;width:100px;height:100px;float: left"/>
							<img id="preview2" style="position: relative; bottom: 0; left: 0;width:100px;height:100px;float: left"/>
								<img id="preview3" style="position: relative; bottom: 0; left: 0;width:100px;height:100px;float: left"/>
									<img id="preview4" style="position: relative; bottom: 0; left: 0;width:100px;height:100px;float: left"/>
										<img id="preview5" style="position: relative; bottom: 0; left: 0;width:100px;height:100px;float: left"/>		
					</div>
					</div>
					
			</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
			<a href="need" class="btn btn-warning pull-right" style="margin: 10px;" value="Submit Your Rental"  id="submit" >Submit Your Rental</a>
			
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="copyright">
					<p>2015 &copy Share My Office All rights reserved</p>
				</div>
			</div>
		</div>
		<div id="fb-root"></div>

	</div>
	<script src="js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="js/uploadimg.js"></script>
	<script src="js/bootstrap.min.js"></script>
<script src="js/jstorage.js"></script>
<script>
$(document).ready(function(){
	$('#uemail').text($.jStorage.get('email'));
	
});
</script>
	<script>
		$(document).ready(function(){
			$.jStorage.flush();
			$("#image_file").addClass("btn btn-primary");
			var count=0;
			
			
			$("#save").click(function(){
				if($.jStorage.get('count')>5){
					alert("Max image upload limit reached please peoceed to submit your post");
				}else{
			 $.ajax({ 
			url: "UploadImage", 
			type: "POST", 
			data: { "dataurl": $("#dataurl").text()}, 
			success: function(data) { 
				count++;
				$.jStorage.set('count',count);
				$.jStorage.set('img'+count,$("#dataurl").text());
				$("#preview"+count).attr('src',$.jStorage.get("img"+count));
				$("#preview").attr('src','');
				$("#dataurl").text('');
				alert("Image Saved Successfully!!Click to add more");
			} 
			});
				}
		});
		});
	</script>

</body>
</html>