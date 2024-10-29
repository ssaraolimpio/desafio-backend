### Desafio Back-end Picpay ###

# Objetivo do Projeto #
Desenvolver um sistema simplificado semelhante ao PicPay, onde usuários comuns(pessoa física) e lojistas podem realizar transações entre si. 
O foco será no fluxo de transferência entre dois usuários.

# Requisitos #
Cadastro de usuários comuns e lojistas com Nome Completo, CPF/CNPJ, e-mail e Senha. CPF/CNPJ e e-mails devem ser únicos no sistema.
Usuários podem enviar dinheiro para lojistas e entre si.
Lojistas apenas recebem transferências.
Validação do saldo do usuário antes da transferência.
Consulta a um serviço autorizador externo antes de finalizar a transferência.
Operação de transferência deve ser uma transação, revertida em caso de inconsistência.
Recebimento de notificações via console quando um usuário ou lojista recebe um pagamento.
O serviço foi implementado seguindo a arquitetura RESTful.

![image](https://github.com/user-attachments/assets/c9ef3ede-0d59-44ff-8ac3-5a2149a212c1)

