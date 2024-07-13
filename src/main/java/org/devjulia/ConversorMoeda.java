package org.devjulia;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual o tipo da sua moeda (por exemplo, BRL): ");
        String converterDe = scanner.nextLine().toUpperCase();
        System.out.println("Digite qual o tipo da moeda que você deseja converter (por exemplo, USD): ");
        String converterPara = scanner.nextLine().toUpperCase();
        System.out.println("Qual quantidade você deseja converter?");
        double quantidadeConverter = scanner.nextDouble();

        String apiKey = "a159ec8b72fce43f07741a25";
        String url_str = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + converterDe;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url_str))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                System.out.println("Erro ao obter taxas de câmbio. Código de status: " + response.statusCode());
                return;
            }

            JsonElement root = JsonParser.parseString(response.body());
            JsonObject jsonobj = root.getAsJsonObject();

            String req_result = jsonobj.get("result").getAsString();
            if (!req_result.equals("success")) {
                System.out.println("Erro ao obter taxas de câmbio.");
                return;
            }

            JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");
            String[] moedasFiltradas = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};
            boolean moedaValida = false;
            for (String moeda : moedasFiltradas) {
                if (moeda.equals(converterPara)) {
                    moedaValida = true;
                    break;
                }
            }
            if (!moedaValida) {
                System.out.println("Moeda não suportada para conversão.");
                return;
            }

            double taxaConversao = conversionRates.get(converterPara).getAsDouble();
            double resultado = quantidadeConverter * taxaConversao;
            System.out.println(quantidadeConverter + " " + converterDe + " é igual a " + resultado + " " + converterPara);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
