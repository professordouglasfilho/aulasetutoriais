window.onpageshow = function(){
    var height = $(document).height();
    $(".imagem-de-fundo").height(height);
}

$(document).ready(function(){
	
    // Adiciona evento de mostrar descrição do item
    $(".item").click(function(event){
        var id_item = "#"+event.currentTarget.id;
        var imagem_do_item = id_item + " div .imagem-do-item";
        var atualizado = id_item + " div .p-atualizado";
        var descricao_do_item = id_item + " div .descricao-item";

        var deCostas = $(imagem_do_item).hasClass("escondido");
        if(deCostas){
            $(id_item).addClass("animated flipInY");
            setTimeout(function(){
                $(id_item).removeClass("animated flipInY");
            },500);
            $(imagem_do_item).removeClass("escondido");
            $(atualizado).removeClass("escondido");
            $(descricao_do_item).addClass("escondido");
        }
        else{
            $(id_item).addClass("animated flipInY");
            setTimeout(function(){
                $(id_item).removeClass("animated flipInY");
            },500);
            $(imagem_do_item).addClass("escondido");
            $(atualizado).addClass("escondido");
            $(descricao_do_item).removeClass("escondido");
        }
    });

    //Esconde texto do código e exibe só o link
    $(".codigo-java").before("<p><a href='javascript:void(0);' onclick='exibirCodigo(event);'>Exibir o código.</a></p>");
    $(".codigo-java").hide();

    //Adiciona efeitos a imagens
    $(".passo img").click(imgClick);
});

function exibirCodigo(event){
    var pElement = event.target.parentElement;
    var containerId = pElement.parentElement.id;
    $(pElement).remove();
    $("#"+containerId+" .codigo-java").show();
    $("#"+containerId+" .codigo-java").prepend("<p style='top:0%;margin-top:0%;float:right;margin-right:4%;'><a style='text-decoration:none !important;font-size:150%;' href='javascript:void(0);' onclick='esconderCodigo(event);'>&times;</a></p>");
}

function esconderCodigo(event){
    var pElement = event.target.parentElement;
    var containerId = pElement.parentElement.parentElement.id;
    $(pElement).remove();
    $("#"+containerId+" .codigo-java").before("<p><a href='javascript:void(0);' onclick='exibirCodigo(event);'>Exibir o código.</a></p>");
    $("#"+containerId+" .codigo-java").hide();
}

function imgClick(event){
    var src = event.target.src;
    var divImagem = "<div class='imagem-maior'><a href='javascript:void(0);' style='float: right; text-decoration:none !important; font-size: 250% !important; margin-right: 1%;' onclick='fechaImagemMaior();'>&times;</a><img style='width: 100% !important; height: 90% !important;' src='"+src+"'/></div>";
    $(".imagem-maior").remove();
    $('body').append(divImagem);
}

function fechaImagemMaior(){
    $(".imagem-maior").remove();
}