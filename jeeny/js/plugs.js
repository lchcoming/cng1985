/**
 * @author ada
 */
$.extend({
    add: function(a, b){
        return a + b;
    }
});
$.fn.extend({

    alertWhileClick: function(){
    
        $(this).click(function(){
        
            alert($(this).val());
        });
    },
    showMessage: function(){
    
        $(this).click(function(){
        
            alert($(this).text());
        });
        
    },
    table: function(tableid){
        $(this).find(" tbody tr:odd").css("background-color", "#bbf");
        $(this).find(" tbody tr:even").css("background-color", "#ffc");
        $(this).find(" tr ").hover(function(){
            $(this).children("td").css("background-color", "#bbf");
        }, function(){
            $(this).children("td").css("background-color", "#ffc");
        });
		 $(this).find(" tr ").click(function(){
		 	$(this).children("td").css("background-color", "#f0c");
		 });
    }
    
});
