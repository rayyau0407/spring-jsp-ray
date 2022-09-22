$(document).ready(function() {
console.log("reach js");
  $('#button1').click(function(event) {
    event.preventDefault();
    $(this).hide("slow");
  });
});``