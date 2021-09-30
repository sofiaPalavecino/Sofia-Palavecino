import requests
from bs4 import BeautifulSoup

if __name__ == '__main__':

    pagina1 = requests.get("https://www.purina.es/gatos/todos-sobre-razas-de-gato/tipos-de-razas-de-gato?breed_name=&page=0")
    pagina2= requests.get("https://www.purina.es/gatos/todos-sobre-razas-de-gato/tipos-de-razas-de-gato?breed_name=&page=1")
    pagina3 = requests.get("https://www.purina.es/gatos/todos-sobre-razas-de-gato/tipos-de-razas-de-gato?breed_name=&page=2")
    pagina4 = requests.get("https://www.purina.es/gatos/todos-sobre-razas-de-gato/tipos-de-razas-de-gato?breed_name=&page=3")


    objeto_sopa1 = BeautifulSoup(pagina1.content, 'html.parser')
    objeto_sopa2 = BeautifulSoup(pagina2.content, 'html.parser')
    objeto_sopa3 = BeautifulSoup(pagina3.content, 'html.parser')
    objeto_sopa4 = BeautifulSoup(pagina4.content, 'html.parser')

    gatosPag1 = objeto_sopa1.find_all('div', class_="results-view-image-container")
    gatosPag2 = objeto_sopa2.find_all('div', class_="results-view-image-container")
    gatosPag3 = objeto_sopa3.find_all('div', class_="results-view-image-container")
    gatosPag4 = objeto_sopa4.find_all('div', class_="results-view-image-container")

    #gatosPag1 = objeto_sopa1.find_all('div', class_="results-view-name")

    lista1=list(gatosPag1)
    for i in range(len(lista1)):

        listaObjetos=lista1[i].children
        print(listaObjetos.find_all('span', class_="results-view-name"))


