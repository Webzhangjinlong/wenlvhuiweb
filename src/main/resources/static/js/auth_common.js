//  这个js 是套用以前同事写的     也可以在jsp里  然后页面引入jsp就可以

	$('.auth').each(function(){
		var self = this;
		var auth_code = $(self).attr("auth_code");
		$.ajax({
			 url: "/system/role_auth?auth_code="+auth_code,
			 data: {},
			 global : false,
			 type: 'GET',
			 dataType :'json'
		 }).done(function(data) {
			
			if(data!=null && data !='undefined' && data.code<0){
				$(self).hide();
			}else{
				$(self).show();
			}
			try{
				var hasChild = false;
				if($(self).parent().hasClass("cw_morebtn")){
					$(self).parent().children().each(function(){
						if($(this).css("display")!='none'){
							hasChild = true;
							return false;
							//return false =break
							//return true =continue
						}
					});
					if(hasChild){
						$(self).parent().show();
					}else{
						$(self).parent().hide();
					}
				}
				
			}catch(e){

			}
			
		 });
	});


	
	