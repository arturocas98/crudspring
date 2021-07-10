function eliminar(idPersona){
	swal({
		  title: "Estás seguro de querer eliminar el registro?",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminar/"+idPersona,
				 success: function(res){
					 /*console.log(res);*/
				 }
			  });
		    swal("Se ha eliminado con éxito el registro!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if (ok){
		    		location.href="/gestionPersonalList";
		    	}
		    });
		  } else {
		    swal("Proceso Cancelado!");
		  }
		});
	
}



function eliminarVehiculo(idVehiculo){
	swal({
		  title: "Estás seguro de querer eliminar el registro?",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminarVehiculo/"+idVehiculo,
				 success: function(res){
					 /*console.log(res);*/
				 }
			  });
		    swal("Se ha eliminado con éxito el registro!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if (ok){
		    		location.href="/listarVehiculo";
		    	}
		    });
		  } else {
		    swal("Proceso cancelado!");
		  }
		});
	
}