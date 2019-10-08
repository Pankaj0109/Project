<!--Add Post Modal-->
<div class="modal fade" id="signUpModal" style="background-color: black;z-index: 100001 !important;">
                                                      <!---if not z index then modal is seen behind the fix navbar-->
  <div class="modal-dialog modal-md">
    <div class="modal-content">
      <!-- Modal Header -->
      <div class="modal-header">
        <h4 class="modal-title" >Sign Up
        </h4>
        <button type="button" class="close" data-dismiss="modal" onclick="javascript:formReset()">&times;
        </button>
      </div>
      <!-- Modal body -->
      <div class="modal-body">
        <form action="signup" id="addPostForm" method="post" onsubmit="return validateForm() ">
          <div class="form-group">
            <input type="text" name="userName" id="userName" class="form-control" placeholder="Username" required="">
            <input type="email" name="email" id="email" class="form-control" placeholder="Email" style="margin-top: 20px" required="">
            <input type="password" name="passWord" id="passWord" class="form-control" placeholder="Password" style="margin-top: 20px" required="">
            <input type="password" name="confirmPassWord" id="confirmPassWord" class="form-control" placeholder="Confirm Password" style="margin-top: 20px" required="">
           <button type="submit" class="btn form-control" style="border-radius: 100px;margin-top: 15px;letter-spacing: 1px ;background-color:  #11ba0b" >SignUp
            </button>
            <button type="button" class="btn btn-secondary form-control" data-dismiss="modal" style="border-radius: 100px;margin-top: 10px;letter-spacing: 1px;background-color:  #f4112b">Cancel
            </button>
          </div>
        </form>
      </div>
      <!-- Modal footer -->
      <div class="modal-footer">
      </div>
    </div>
  </div>
</div>
<!--modal ends-->
<script type="text/javascript">
  function validateForm(frm)
  {
 ;
 if(document.getElementById("passWord").value==document.getElementById("confirmPassWord").value)
 {
  return true;
 }
 alert("Enter similar password");
 return false;
  }
</script>