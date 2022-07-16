fun portaria() {

    print("Informe a idade: ")
    val idade = readLine()
    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {

            println("Negado. Menores de idade não são permitidos!")
        } else {
            print("Informe o tipo do convite: ")
            var tipoconvite = readLine()
            if (tipoconvite != null && tipoconvite != "") {
                tipoconvite = tipoconvite.lowercase()

                if (tipoconvite == "normal" || tipoconvite == "premium" || tipoconvite == "luxo") {

                    print("Informe o código do convite: ")
                    var codigo = readLine()

                    if (codigo != null && codigo != "") {
                        codigo = codigo.lowercase()

                        if (tipoconvite != null && codigo.startsWith("xt")) {
                            println("Seja bem vindo!")
                        } else if (tipoconvite == "premium" || tipoconvite == "luxo" && codigo.startsWith("xl")){
                            println("Seja bem vindo!")
                        } else {
                             println("Negado, convite inválido.")
                        }
                    }

                } else {
                    println("Negado, convite inálido.")
                    return
                }
            }
        }
    }
}


fun main(){

    portaria()

}