/**
 * @author ada
 */
(function($){
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
            
        }
        
    });
    
})(jQuery);
