/**
 * Created by shashi on 15/6/16.
 */

;(function($){
    "use strict";

    $.fn.createWord = function(opts){
        var options = $.extend({ }, opts);

        return this.each(function(){
            var $form = $(this);
            var $submitButton = $form.find(".modal-footer .submit");

            $submitButton.on('click' , submitOnClick);

            function submitOnClick(){
                $.ajax({
                    url: opts.pageContext + "/mongo/word/new",
                    type: 'POST',
                    data: $("#"+opts.formId).serialize(),
                    dataType:"json",
                    contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
                    success: function(response){
                        BootstrapDialog.show({
                            title: 'Success',
                            message: 'Successfully Entered New Word'
                        });
                    },
                    error: function(response){
                        BootstrapDialog.show({
                            title: 'Error',
                            message: response.responseJSON.error + ' Please try again.'
                        });
                    }
                });
            }
        });
    };
})(jQuery);
