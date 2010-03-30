

		<script type="text/javascript">
	$(function() {
			$("#tree").treeview({
				collapsed: true,
				
				control:"#sidetreecontrol",
				//animated: "medium",
				persist: "location"
			});
		})
	</script>
		<div id="sidetree">
				<div class="treeheader">
					&nbsp;
				</div>
				<div id="sidetreecontrol">
					<a href="?#">ÊÕËõ</a> |
					<a href="?#">Õ¹¿ª</a>
				</div>

               ${trees}

			</div>
	
