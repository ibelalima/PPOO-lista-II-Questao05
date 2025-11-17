# Questão – Processador de Textos
## Padrão de Projeto: Template Method

Este repositório contém a solução da questão sobre aplicação do **padrão Template Method** para unificar e simplificar o comportamento de duas classes processadoras de texto:

- Uma converte todo o texto para **maiúsculo**
- A outra converte todo o texto para **minúsculo**

Ambas possuíam código duplicado e métodos idênticos, diferindo apenas na conversão final.  
O objetivo da questão é evitar essa duplicação e aplicar corretamente o padrão Template Method.

---

# 1. 🎯 Objetivo da Questão

A partir de duas classes quase idênticas (`TudoMaiuscula` e `TudoMinuscula`), devia-se:

- Identificar o comportamento comum
- Criar uma classe abstrata com o método template
- Implementar os métodos que estavam vazios (`TODO`)
- Criar subclasses que definem apenas a conversão específica
- Criar um `main()` para demonstrar o funcionamento

---

# 2. 🧠 Sobre o Padrão Template Method

O Template Method determina o **esqueleto de um algoritmo** dentro de um método final da superclasse, permitindo que subclasses redefinam **apenas etapas específicas**, sem alterar o fluxo principal.

No contexto desta questão:

### O fluxo final é:
1. Extrair caracteres  
2. Converter caracteres (em maiúsculo ou minúsculo)  
3. Juntar e formar o texto final  

Somente o passo 2 muda entre as classes.

---

# 3. 📂 Estrutura do Projeto

