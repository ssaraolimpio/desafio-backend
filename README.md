## Desafio Back-end Picpay ##

### Objetivo do Projeto ###
Desenvolver um sistema simplificado semelhante ao PicPay, onde usuários comuns(pessoa física) e lojistas podem realizar transações entre si. 
O projeto foca principalmente no **fluxo de transferência** entre usuários, incluindo a validação de saldo, autorização externa, e notificações de transações.

### Requisitos ###
1. **Cadastro de Usuários e Lojistas**  
   - Registro de **Usuários Comuns** e **Lojistas** com os seguintes dados:
     - Nome Completo
     - CPF (para Usuários) / CNPJ (para Lojistas)
     - E-mail
     - Senha
   - **Regras de Unicidade**:
     - CPF/CNPJ e e-mail devem ser únicos no sistema.

2. **Transferências e Restrições**  
   - **Usuários** podem realizar transferências para outros usuários e lojistas.
   - **Lojistas** podem apenas **receber** transferências, sem possibilidade de enviar.

3. **Validação de Saldo e Autorização Externa**  
   - Verificação do **saldo disponível** do usuário antes de permitir uma transferência.
   - Consulta a um **serviço externo autorizador** para validar a operação antes de concluí-la.

4. **Transação Segura**  
   - A operação de transferência deve ser realizada como uma **transação**, garantindo que:
     - Em caso de inconsistências, a operação seja revertida automaticamente.

5. **Notificações**  
   - Envio de notificações (via console) quando um **usuário** ou **lojista** recebe um pagamento.

6. **Arquitetura do Serviço**  
   - Implementação do serviço seguindo os **princípios RESTful**, garantindo uma interface padronizada e fácil integração.

### Visão de Arquitetura ###
   - Diagrama de Classes
     
![image](https://github.com/user-attachments/assets/c9ef3ede-0d59-44ff-8ac3-5a2149a212c1)

