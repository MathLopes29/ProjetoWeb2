package rota.projeto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
public class AppConfig {

    @RequestMapping
    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    @Bean(name="appName")
    public String appName(){
            return "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "  <head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Index</title>\n" +
                    "    <style>\n" +
                    "      body {\n" +
                    "        font-family: Arial, sans-serif;\n" +
                    "        background-color: #f8f8f8;\n" +
                    "      }\n" +
                    "      .container {\n" +
                    "        max-width: 800px;\n" +
                    "        margin: 0 auto;\n" +
                    "        text-align: center;\n" +
                    "        padding-top: 100px;\n" +
                    "      }\n" +
                    "      h1 {\n" +
                    "        font-size: 48px;\n" +
                    "        font-weight: bold;\n" +
                    "        color: #d9534f;\n" +
                    "        margin-bottom: 20px;\n" +
                    "      }\n" +
                    "      h2 {\n" +
                    "        font-size: 36px;\n" +
                    "        color: #333;\n" +
                    "        margin-bottom: 50px;\n" +
                    "      }\n" +
                    "      button {\n" +
                    "        padding: 12px 24px;\n" +
                    "        background-color: #d9534f;\n" +
                    "        color: #fff;\n" +
                    "        border: none;\n" +
                    "        border-radius: 4px;\n" +
                    "        font-size: 18px;\n" +
                    "        cursor: pointer;\n" +
                    "        transition: background-color 0.3s ease;\n" +
                    "      }\n" +
                    "      button:hover {\n" +
                    "        background-color: #c9302c;\n" +
                    "      }\n" +
                    "    </style>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "    <div class=\"container\">\n" +
                    "      <h1>Seja Bem-Vindo, Se está lendo essa mensagem quer dizer que o Servidor está em Funcionamento!</h1>\n" +
                    "      <h2>É um prazer estar servindo como testes e estudos para o grupo de estudos da Fatec Zona Sul</h2>\n" +
                    "      <h2>Este é o arquivo Index do Servidor Web</h2>\n" +
                    "    </div>\n" +
                    "  </body>\n" +
                    "</html>";
        }


    @RequestMapping
    @GetMapping(value = "/404", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    @Bean(name="appName2")
    public String appName2(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"pt-br\">\n" +
                "  <head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Erro 404 - Página não encontrada</title>\n" +
                "    <style>\n" +
                "      body {\n" +
                "        background-color: #f8f8f8;\n" +
                "        font-family: Arial, sans-serif;\n" +
                "      }\n" +
                "      .container {\n" +
                "        max-width: 600px;\n" +
                "        margin: 0 auto;\n" +
                "        text-align: center;\n" +
                "        padding: 50px;\n" +
                "      }\n" +
                "      h1 {\n" +
                "        font-size: 72px;\n" +
                "        color: #d9534f;\n" +
                "        margin-bottom: 0;\n" +
                "      }\n" +
                "      p {\n" +
                "        font-size: 24px;\n" +
                "        color: #333;\n" +
                "        margin-top: 0;\n" +
                "      }\n" +
                "      img {\n" +
                "        margin-top: 50px;\n" +
                "        max-width: 100%;\n" +
                "      }\n" +
                "    </style>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div class=\"container\">\n" +
                "      <h1>Erro 404</h1>\n" +
                "      <p>Página não encontrada <br> Hmmm... Aparentemente há algum problema na rota que está tentando acessar! <br> Verifique a URL utilizada e tente novamente.</p>\n" +
                "      <img src=\"https://media.istockphoto.com/id/1197233052/pt/vetorial/page-not-found-error-404-robot-fix-repair-fatal-broke-crash-hand-drawn-sketch-vector-line.jpg?s=170667a&w=0&k=20&c=mrZE8tgov47IyCkF9jemQay6YQt8Py6gnHt4teZyK3Y=\" alt=\"Robô 404\">\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>";
    }

    @RequestMapping
    @GetMapping(value = "/integrantes", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    @Bean(name="appName3")
    public String appName3(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<meta charset=\"utf-8\">\n" +
                "\t<title>Integrantes</title>\n" +
                "\t<style>\n" +
                "\t\tbody {\n" +
                "\t\t\tbackground-color: #f5f5f5;\n" +
                "\t\t\tfont-family: Arial, sans-serif;\n" +
                "\t\t\tmargin: 0;\n" +
                "\t\t\tpadding: 0;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t.container {\n" +
                "\t\t\tmax-width: 800px;\n" +
                "\t\t\tmargin: 0 auto;\n" +
                "\t\t\tpadding: 20px;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\th1 {\n" +
                "\t\t\tfont-size: 36px;\n" +
                "\t\t\tcolor: #333;\n" +
                "\t\t\tmargin-bottom: 20px;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\th2 {\n" +
                "\t\t\tfont-size: 24px;\n" +
                "\t\t\tcolor: #333;\n" +
                "\t\t\tmargin-top: 30px;\n" +
                "\t\t\tmargin-bottom: 10px;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\tp {\n" +
                "\t\t\tfont-size: 18px;\n" +
                "\t\t\tcolor: #333;\n" +
                "\t\t\tmargin-bottom: 20px;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\tul {\n" +
                "\t\t\tlist-style: none;\n" +
                "\t\t\tmargin: 0;\n" +
                "\t\t\tpadding: 0;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\tli {\n" +
                "\t\t\tfont-size: 18px;\n" +
                "\t\t\tcolor: #333;\n" +
                "\t\t\tmargin-bottom: 5px;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\tli:before {\n" +
                "\t\t\tcontent: \"•\";\n" +
                "\t\t\tmargin-right: 5px;\n" +
                "\t\t\tcolor: #FF5733;\n" +
                "\t\t}\n" +
                "\t</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<div class=\"container\">\n" +
                "\t\t<h1 style=\"text-align: center;\">Integrantes do Grupo - Auto Rating Software</h1><br>\n" +
                "\t\t<h2 style=\"text-align: center;\">Felipe Valeriano - Front-End</h2>\n" +
                "\t\t<h2 style=\"text-align: center;\"> Matheus Lopes - Banco de Dados</h2>\n" +
                "\t\t<h2 style=\"text-align: center;\"> Matheus Martins - Back-End</h2>\n" +
                "\t\n" +
                "\t</div>\n" +
                "</body>\n" +
                "</html>";

    }



    @RequestMapping
    @GetMapping(value = "/cep", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    @Bean(name="appName4")
    public String appName4(){
        return"<!DOCTYPE html>\n" +
                "<html lang=\"pt-br\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n" +
                "    <meta name=\"viewport\", content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Consulta API ViaCEP</title>\n" +
                "\n" +
                "    <style>\n" +
                "        body {\n" +
                "          font-family: Arial, sans-serif;\n" +
                "          background-color: #f8f8f8;\n" +
                "        }\n" +
                "        .container {\n" +
                "          max-width: 800px;\n" +
                "          margin: 0 auto;\n" +
                "          text-align: center;\n" +
                "          padding-top: 100px;\n" +
                "        }\n" +
                "        h1 {\n" +
                "          font-size: 48px;\n" +
                "          font-weight: bold;\n" +
                "          color: #d9534f;\n" +
                "          margin-bottom: 20px;\n" +
                "        }\n" +
                "        h2 {\n" +
                "          font-size: 36px;\n" +
                "          color: #333;\n" +
                "          margin-bottom: 50px;\n" +
                "        }\n" +
                "        label{\n" +
                "            font-size: 20px;\n" +
                "            color: #333;\n" +
                "            margin-bottom: 25px;\n" +
                "        }\n" +
                "        p {\n" +
                "            font-size: 20px;\n" +
                "            color: #333;\n" +
                "            margin-bottom: 25px;\n" +
                "        }\n" +
                "        button {\n" +
                "          padding: 12px 24px;\n" +
                "          background-color: #d9534f;\n" +
                "          color: #fff;\n" +
                "          border: none;\n" +
                "          border-radius: 4px;\n" +
                "          font-size: 18px;\n" +
                "          cursor: pointer;\n" +
                "          transition: background-color 0.3s ease;\n" +
                "        }\n" +
                "        button:hover {\n" +
                "          background-color: #c9302c;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "    <div align=\"center\">\n" +
                "        <h1>Consulta Endereço ViaCEP</h1>\n" +
                "        <label>Digite seu CEP: </label>\n" +
                "        <input type=\"number\" id=\"cep\"/>\n" +
                "        <button onclick=\"consultaEndereco()\"> Consultar </button>\n" +
                "        <div id=\"resultado\">\n" +
                "            <p>Seu Resultado Aqui!</p>\n" +
                "        </div>\n" +
                "    </div><br>\n" +
                "    <script>\n" +
                "        function consultaEndereco(){\n" +
                "            let cep = document.querySelector('#cep').value;\n" +
                "            \n" +
                "            if(cep.length !== 8){\n" +
                "                alert('CEP Invalido!');\n" +
                "                return;\n" +
                "            }\n" +
                "\n" +
                "            let url = `https://viacep.com.br/ws/${cep}/json/`;\n" +
                "            \n" +
                "            fetch(url).then(function(response){\n" +
                "                response.json().then(mostrarEndereco)            \n" +
                "            });\n" +
                "        }\n" +
                "\n" +
                "        function mostrarEndereco(dados){\n" +
                "            let resultado = document.querySelector('#resultado');\n" +
                "            if (dados.erro){\n" +
                "                resultado.innerHTML = \"Não foi possível localizar o endereço!\";\n" +
                "            } else {\n" +
                "            resultado.innerHTML = `<p> Endereço: ${dados.logradouro} </p>\n" +
                "                                   <p> Bairro: ${dados.bairro} </p>\n" +
                "                                   <p> Cidade: ${dados.localidade} - ${dados.uf} </p>`\n" +
                "            }//<p> Complemento: ${dados.complemento} </p>//\n" +
                "        }\n" +
                "    </script>\n" +
                "</body>\n" +
                "</html>";
    }

    @RequestMapping
    @GetMapping(value = "/notas", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    @Bean(name="appName5")
    public String appName5(){
        return"<!DOCTYPE html>\n" +
                "<html lang=\"pt-br\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n" +
                "    <meta name=\"viewport\", content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Consulta API Media</title>\n" +
                "\n" +
                "    <style>\n" +
                "        body {\n" +
                "          font-family: Arial, sans-serif;\n" +
                "          background-color: #f8f8f8;\n" +
                "        }\n" +
                "        .container {\n" +
                "          max-width: 800px;\n" +
                "          margin: 0 auto;\n" +
                "          text-align: center;\n" +
                "          padding-top: 100px;\n" +
                "        }\n" +
                "        h1 {\n" +
                "          font-size: 48px;\n" +
                "          font-weight: bold;\n" +
                "          color: #d9534f;\n" +
                "          margin-bottom: 20px;\n" +
                "        }\n" +
                "        h2 {\n" +
                "          font-size: 36px;\n" +
                "          color: #333;\n" +
                "          margin-bottom: 50px;\n" +
                "        }\n" +
                "        label{\n" +
                "            font-size: 20px;\n" +
                "            color: #333;\n" +
                "            margin-bottom: 25px;\n" +
                "        }\n" +
                "        p {\n" +
                "            font-size: 20px;\n" +
                "            color: #333;\n" +
                "            margin-bottom: 25px;\n" +
                "        }\n" +
                "        button {\n" +
                "          padding: 12px 24px;\n" +
                "          background-color: #d9534f;\n" +
                "          color: #fff;\n" +
                "          border: none;\n" +
                "          border-radius: 4px;\n" +
                "          font-size: 18px;\n" +
                "          cursor: pointer;\n" +
                "          transition: background-color 0.3s ease;\n" +
                "        }\n" +
                "        button:hover {\n" +
                "          background-color: #c9302c;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "    <div align=\"center\">\n" +
                "        <h1>Calcula a Media</h1><br><br>\n" +
                "        <label> Primeira Nota: </label>\n" +
                "        <input type=\"number\" id=\"nota1\"><br>\n" +
                "\n" +
                "        <label> Segunda Nota: </label>\n" +
                "        <input type=\"number\" id=\"nota2\"><br>\n" +
                "\n" +
                "        <label> Nota do Projeto</label>\n" +
                "        <input type=\"number\" id=\"projeto\"><br><br><br>\n" +
                "\n" +
                "        <button onclick=\"calcularMedia()\"> Calcular Média </button>\n" +
                "        <div id=\"resultado\">\n" +
                "            <p>Verificar Resultado!</p>\n" +
                "        </div>\n" +
                "    </div><br>\n" +
                "    <script>          \n" +
                "        function CalculadoraMedia() {\n" +
                "            this.nota1 = 0;\n" +
                "            this.nota2 = 0;\n" +
                "            this.projeto = 0;\n" +
                "            \n" +
                "            this.setNota1 = function(nota) {\n" +
                "                this.nota1 = parseFloat(nota);\n" +
                "            };\n" +
                "                                    \n" +
                "            this.setNota2 = function(nota) {\n" +
                "                this.nota2 = parseFloat(nota);\n" +
                "            };\n" +
                "\n" +
                "            this.setProjeto = function(nota){\n" +
                "                this.projeto = parseFloat(nota);\n" +
                "            };\n" +
                "            \n" +
                "            this.calcularMedia = function() {\n" +
                "                var media = (((this.nota1 + this.nota2)* 0.6) / 2) + (this.projeto * 0.4);\n" +
                "                \n" +
                "                if (media >= 6) {\n" +
                "                    if (media == 10) {\n" +
                "                        resultado.textContent = \"Sua Média é \" + media + \" e tirou a nota maxima\";\n" +
                "                    } else {\n" +
                "                        resultado.textContent = \"Parabéns, aprovado! Média: \" + media;\n" +
                "                    }\n" +
                "                } else {\n" +
                "                    resultado.textContent = \"Reprovado! com Média: \" + media;\n" +
                "                }\n" +
                "            };\n" +
                "        }\n" +
                "        \n" +
                "        function calcularMedia() {\n" +
                "            var calculadora = new CalculadoraMedia();\n" +
                "            calculadora.setNota1(document.getElementById(\"nota1\").value);\n" +
                "            calculadora.setNota2(document.getElementById(\"nota2\").value);\n" +
                "            calculadora.setProjeto(document.getElementById(\"projeto\").value);\n" +
                "            calculadora.calcularMedia();\n" +
                "        }\n" +
                "\n" +
                "        function mostrarMedia(dados){\n" +
                "            let resultado = document.querySelector('#resultado');\n" +
                "            if (dados.erro){\n" +
                "                resultado.innerHTML = \"Valor Incorreto! Tente Novamente!\";\n" +
                "            } else {\n" +
                "            resultado.innerHTML = `<p> 1º Nota: ${dados.nota1} </p>\n" +
                "                                   <p> 2º Nota: ${dados.nota2} </p>\n" +
                "                                   <p> Nota do Projeto: ${dados.projeto} </p>\n" +
                "                                   <p> Média: ${dados.media} </p>`\n" +
                "            }\n" +
                "        }\n" +
                "    </script>\n" +
                "</body>\n" +
                "</html>";
    }
}

