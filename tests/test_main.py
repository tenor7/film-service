import requests

api = 'http://localhost:8081/film'


def test_film_empty_get():
    s = requests.Session()
    id = 'c1827b19-0b09-4b62-afbc-c64bf237e70b'
    response = s.get(f'{api}/{id}')
    assert response.status_code == 200

def test_film_save_and_get():
    s = requests.Session()
    parameters = "?title=tenor&authorId=c1827b19-0b09-4b62-afbc-c64bf237e70b"
    response = s.post(f'{api}/{parameters}')
    assert response.status_code == 200
    assert response.json().get('title') == 'tenor'
    createdFilmId = response.json().get('id')
    responseFilm = s.get(f'{api}/{createdFilmId}')
    assert responseFilm.status_code == 200
    assert responseFilm.json().get('title') == 'tenor'