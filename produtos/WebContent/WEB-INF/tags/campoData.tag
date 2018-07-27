<%@ attribute name="id" required="true"%>
<%@ attribute name="name" required="true"%>

<script type="text/javascript">
	$(document).ready(function(){
		$("#${id}").datepicker({ dateFormat: 'dd/mm/yy' });
	});
</script>
<input type="text" id="${id}" name="${name}" />