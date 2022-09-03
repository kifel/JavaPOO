Já tinha realizado esse desafio na IDE portugol Studio, segue abaixo o código desenvolvido na disciplina Logica de programação :

programa
{

	funcao inicio()
	{
		inteiro quantidade = 1, pos, ini
		escreva("Digite um número: ")
		leia (pos)

		ini = pos

		escreva("\n")

		para (inteiro i = 1; i <= pos; i++){
			para (inteiro j = 1; j <= ini; j++){
				escreva(" ")
			}
			ini = ini - 1
			para (inteiro j = 0; j < quantidade; j++){
				escreva("*")
			}
			quantidade = quantidade + 2
			escreva("\n")	
		}

		ini = pos - 1
				
		para (inteiro i = 0; i < 3; i++){
			para (inteiro j = 1; j <= ini; j++){
				escreva(" ")
			}
		
			para (inteiro j = 0; j < 3; j++){
				escreva("*")
			}
			escreva("\n")	
		}
	}
}