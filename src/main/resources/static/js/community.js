
/**
 * 提交回复
 */
function post() {
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();
    $.ajax({
        type :"POST",
        url : "/comment",
        data : JSON.stringify({
            "parentId":questionId,
            "content":content,
            "type":1
        }),
        success : function(response) {
            if (response.code == 200) {
                $("#comment_section").hide();
            } else {
                if (response.code = 2003){
                    var isAccepted = confirm(response.message);
                    if (isAccepted) {
                        window.open("https://github.com/login/oauth/authorize?client_id=6bb31e053f66281b93cb&redirect_uri=" + document.location.origin + "/callback&scope=user&state=1");
                        window.localStorage.setItem("closable", true);
                    }
                } else {
                    alert(response.message);
                }
            }
            console.log(response);
        },
        dataType: "json"
    });

}

