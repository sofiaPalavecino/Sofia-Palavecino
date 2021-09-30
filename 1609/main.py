import requests
from bs4 import BeautifulSoup

if __name__ == '__main__':
    pagina1 = requests.get("https://www.purina.es/gatos/todos-sobre-razas-de-gato/tipos-de-razas-de-gato?breed_name=&page=0")
    pagina2= requests.get("https://www.purina.es/gatos/todos-sobre-razas-de-gato/tipos-de-razas-de-gato?breed_name=&page=1")
    pagina3 = requests.get("https://www.purina.es/gatos/todos-sobre-razas-de-gato/tipos-de-razas-de-gato?breed_name=&page=2")
    pagina4 = requests.get("https://www.purina.es/gatos/todos-sobre-razas-de-gato/tipos-de-razas-de-gato?breed_name=&page=3")
    print("codigo: ", pagina1.status_code)


    objeto_sopa = BeautifulSoup(pagina1.content, 'html.parser')

    gatosPag1 = objeto_sopa.find_all('div', class_='results-view-name')
    lista1=list(gatosPag1)
    for i in range(len(lista1)):
        print(lista1[i])

