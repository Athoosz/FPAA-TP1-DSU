# FPAA-TP1-DSU

# Análise de Desempenho: Disjoint Set Union (DSU)

Repositório do Trabalho Prático 1 da disciplina de **Fundamentos de Projeto e Análise de Algoritmos**.

O objetivo é analisar, na prática, como diferentes otimizações afetam o desempenho da estrutura **Disjoint Set Union (DSU)**.

Toda a explicação teórica detalhada, gráficos de performance e análise dos resultados estão disponíveis no nosso artigo técnico.

## Artigo Técnico
O relatório completo pode ser acessado aqui:

 **[Acesse o PDF do Artigo](./Analise_impacto_estruturas_de_dados_otimizadas.pdf)**

---

## Como rodar localmente

Se você possui o Java (versão 17 ou superior), siga os passos abaixo no terminal:

1. **Compilar tudo:**

   ```bash
   mkdir -p bin
   javac -d bin src/dsu/*.java src/operationtime/*.java src/Main.java
   ```

2. **Executar os testes:**

   ```bash
   java -cp bin Main
   ```

---

## Estrutura do Projeto

1. **`DSUNaive`**: Implementação básica, sem heurísticas de balanceamento ou compressão. Complexidade de pior caso degenerada em $O(n)$ por operação de busca.
2. **`DSUUnionByRank`**: Incorpora a heurística de união por posto (*Union by Rank*), que utiliza a altura limitante da árvore para balanceamento. Reduz a complexidade para $O(\log n)$.
3. **`DSUFullTarjan`**: Estende a variante anterior adicionando a heurística de compressão de caminho (*Path Compression*) na operação `findSet`. Atinge tempo amortizado quase constante de $O(\alpha(n))$, onde $\alpha$ é a inversa da função de Ackermann.

```
dsu_code/
├── src/
│   ├── dsu/
│   │   ├── DSU.java              
│   │   ├── DSUNaive.java         
│   │   ├── DSUUnionByRank.java   
│   │   └── DSUFullTarjan.java    
│   ├── operationtime/
│   │   ├── OperationTime.java    
│   │   └── OperationTimeResult.java
│   └── Main.java                
└── README.md
```

---

## Autores

- Athos Marques
- Bruna C. Markowisk
- Thiago Branco