import requests

api = 'http://localhost:8081/film'


def test_film_empty_get():
    s = requests.Session()
    id = '8c34c25b-b4a1-477a-a938-d6ad10442c98'
    response = s.get(f'{api}/{id}')
    assert response.status_code == 200

def test_film_save_and_get():
    s = requests.Session()
    parameters = "?title=tenor&authorId=8c34c25b-b4a1-477a-a938-d6ad10442c98"
    response = s.post(f'{api}/{parameters}')
    assert response.status_code == 200
    assert response.json().get('title') == 'tenor'
    createdFilmId = response.json().get('id')
    responseFilm = s.get(f'{api}/{createdFilmId}')
    assert responseFilm.status_code == 200
    assert responseFilm.json().get('title') == 'tenor'