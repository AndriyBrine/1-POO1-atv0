def f_fatorial(n:int)->int:
	fator = int()
	fator = 1
	for i in range (1, n+1):
		fator = fator * i

	return fator

def main():
	n = int()
	n = int(input("Digite o número que você busca o fatorial "))
	print(f_fatorial(n)) # sem precisar fazer a variável fatorial

if __name__ == "__main__":
	main() #Ativa a função, e você que põe. No java, não é necessário