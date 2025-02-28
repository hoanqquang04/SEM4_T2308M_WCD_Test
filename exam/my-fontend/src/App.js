import React from 'react';
import { BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import AuthorList from './components/Author/AuthorList'; // Đường dẫn đến AuthorList
import AddAuthor from './components/Author/AddAuthor'; // Đường dẫn đến AddAuthor
import UpdateAuthor from './components/Author/UpdateAuthor'; // Đường dẫn đến UpdateAuthor
import BookList from './components/Book/BookList'; // Đường dẫn đến BookList
import AddBook from './components/Book/AddBook'; // Đường dẫn đến AddBook
import UpdateBook from './components/Book/UpdateBook'; // Đường dẫn đến UpdateBook

const App = () => {
    return (
        <Router>
            <Routes>
                {/* Routes cho tác giả */}
                <Route path="/" element={<AuthorList />} /> {/* Đặt AuthorList làm trang mặc định */}
                <Route path="/add-author" element={<AddAuthor />} />
                <Route path="/authors" element={<AuthorList />} />
                <Route path="/edit-author/:id" element={<UpdateAuthor />} /> {/* Route cho UpdateAuthor */}

                {/* Routes cho sách */}
                <Route path="/books" element={<BookList />} /> {/* Danh sách sách */}
                <Route path="/add-book" element={<AddBook />} /> {/* Thêm sách */}
                <Route path="/edit-book/:id" element={<UpdateBook />} /> {/* Cập nhật sách */}
            </Routes>
        </Router>
    );
};

export default App;