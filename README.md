# 🧮 Calculadora de Imposto de Renda e Salário Líquido

Este é um sistema financeiro simples desenvolvido em Java para automatizar o cálculo de faixas de imposto sobre o salário bruto de um usuário, devolvendo o valor descontado e o salário líquido final.

## 🚀 Funcionalidades

* **Leitura de Salário Bruto:** Recebe valores monetários precisos via teclado.
* **Cálculo por Faixas (Condicionais Encadeadas):** Aplica a alíquota correta baseada no ganho real:
  * Até R$ 2500,00: **Isento** (0%)
  * Até R$ 5000,00: **15%** de imposto
  * Acima de R$ 5000,00: **27%** de imposto
* **Demonstrativo Detalhado:** Exibe na tela o salário bruto, o total retido em reais e o quanto vai de fato para o bolso do trabalhador.

## 🛠️ Tecnologias Utilizadas

* **Java** (Estruturas condicionais encadeadas com `if / else if / else`, cálculos matemáticos simples e variáveis do tipo `double`).
* **Git & GitHub** (Versionamento de código e histórico de commits).