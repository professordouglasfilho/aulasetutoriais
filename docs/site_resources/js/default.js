$(document).ready(function(){
	var height = $(document).height();
    $(".imagem-de-fundo").height(height);
	
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
});