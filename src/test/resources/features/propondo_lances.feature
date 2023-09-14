
# language: pt

Funcionalidade: Propondo lances

Cenario: Propondo um unico lance valido
 Dado um lance valido
 Quando propoe o lance
 Entao o lance eh aceito

Cenario: Propondo varios lances validos
 Dado um lance de "fulano" de 10.0 reais 
 E um lance de "beltrano" de 15.00 reais
 Quando propoe varios lances
 Entao os lances sao aceitos

Esquema do Cenario: Propondo um lance invalido
 Dado um lance invalido de <valor> reais e do usuario '<nomeUsuario>'
 Quando propoe o lance
 Entao o lance nao eh aceito

 Exemplos:
 | valor | nomeUsuario |
 |  0    | beltrano    |
 | -1    | cigano      |

Cenario: Propondo uma sequencia de lances
 Dado dois lances
 | valor | nomeUsuario |
 |  10.0 | beltrano    |
 |15.0   | beltrano    | 
 Quando propoe varios lances
 Entao o segundo lance nao eh aceito