

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
					<a href="?#">����</a> |
					<a href="?#">չ��</a>
				</div>

               ${trees}

			</div>
	
