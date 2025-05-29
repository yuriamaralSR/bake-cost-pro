# BakeCost Pro 🍰

**Sistema inteligente para cálculo de custos em confeitarias, com potencial de evolução para controle completo de produção, estoque e vendas.**

---

## 🔍 Visão Geral

BakeCost Pro é um sistema web desenvolvido com **Java 21**, **Spring Boot** e **MySQL**, com o objetivo de oferecer uma plataforma escalável e profissional para gestão de confeitarias.

O projeto foi iniciado como um MVP focado no **cálculo de custos de receitas e produtos**, mas foi arquitetado para expandir com funcionalidades como:

- 📦 Controle de estoque
- 🧾 Gestão de pedidos e encomendas
- 💰 Módulo financeiro
- 🛒 Frente de caixa (PDV)
- 👥 Controle de usuários

---
## 💼 Simulação de Ambiente Profissional

Este projeto está sendo desenvolvido como uma iniciativa de aprendizado prático, simulando um ambiente de trabalho real com as seguintes diretrizes:

Assumo o papel de **Desenvolvedor Júnior**, conduzindo todas as implementações, enquanto utilizo o ChatGPT como uma **ferramenta de mentoria técnica e suporte** — simulando um ambiente real com acompanhamento de um **Dev Sênior**.

Essa estrutura busca aplicar conhecimentos adquiridos na faculdade e no estágio, bem como práticas de desenvolvimento profissional como versionamento, organização em camadas, uso de banco de dados relacional e metodologia ágil.

---

## 🏗️ Tecnologias Utilizadas

| Camada        | Tecnologia           |
|---------------|----------------------|
| Backend       | Java 21, Spring Boot |
| Banco de Dados| MySQL                |
| Build Tool    | Maven                |
| IDE           | IntelliJ IDEA        |
| Versionamento | Git + GitHub         |

---

## 🎯 Objetivos do MVP

1. Cadastro de insumos (ingredientes)
2. Cadastro de receitas com múltiplos insumos
3. Cadastro de produtos com base em múltiplas receitas
4. Cálculo de custo total de uma receita e de um produto final

---

## 🔄 Metodologia de Desenvolvimento

- Modelo ágil com simulação de ambiente de equipe de software
- Aplicação de boas práticas de versionamento (Git Flow simplificado)
- Organização em pacotes por camada (model, repository, service, controller)

---

## 🚧 Status do Projeto

✅ Fase 1 (MVP) - Em desenvolvimento  
⬜ Fase 2 (Estoque, Pedidos, PDV, etc.) - Planejamento

---

## 🧠 Modelagem Inicial do Banco de Dados

![](docs/bd-diagram.png) <!-- opcional, se for adicionar imagem depois -->

### Principais Entidades:

- **Input**: insumos com preço e unidade
- **Recipe**: receitas com ingredientes e quantidades
- **Product**: produto final formado por receitas

---

## 🧭 Roadmap Técnico (Resumo)

| Etapa           | Status     |
|------------------|------------|
| Modelagem de dados | ✅ Concluído |
| Estrutura base do projeto | ✅ Concluído |
| Cadastro de Inputs  | ⏳ Em andamento |
| Cadastro de Receitas | ⏳ Em breve |
| Cálculo automático de custo | ⏳ Em breve |
| Interface Web (frontend) | ⏳ A definir |

---

## 🤝 Contribuição

Este repositório faz parte de um estudo individual. Futuras contribuições e feedbacks são bem-vindos!

